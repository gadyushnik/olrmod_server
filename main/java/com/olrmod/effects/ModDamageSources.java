package com.olrmod.effects;

import net.minecraft.util.DamageSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModDamageSources {
    private static final Logger LOGGER = LogManager.getLogger("OLRMod");

    public static final DamageSource RADIATION = new DamageSource("mod_radiation").setDamageBypassesArmor();
    public static final DamageSource CHEMICAL = new DamageSource("mod_chemical").setDamageBypassesArmor();
    public static final DamageSource GRAVITATIONAL = new DamageSource("mod_gravitational").setDamageBypassesArmor();
    public static final DamageSource PSY = new DamageSource("mod_psy").setDamageBypassesArmor();
    public static final DamageSource ELECTRIC = new DamageSource("mod_electric").setDamageBypassesArmor();
    public static final DamageSource FIRE = new DamageSource("mod_fire").setDamageBypassesArmor();
    public static final DamageSource GENERIC = new DamageSource("mod_generic").setDamageBypassesArmor();

    public static DamageSource fromType(EffectStageManager.EffectType type) {
        if (type == null) {
            LOGGER.warn("Null effect type in damage source request");
            return GENERIC;
        }
        switch (type) {
            case RADIATION: return RADIATION;
            case CHEMICAL: return CHEMICAL;
            case GRAVITATIONAL: return GRAVITATIONAL;
            case PSY: return PSY;
            case ELECTRIC: return ELECTRIC;
            case FIRE: return FIRE;
            default:
                LOGGER.warn("Unknown effect type: {}", type);
                return GENERIC;
        }
    }
}
