package com.viago.entities.enumerations;

public enum DocumentType {
    DRIVING_LICENSE {
        public String toString() {
            return "Driving license";
        }
    },
    VEHICLE_PAPER {
        public String toString() {
            return "Vehicle paper";
        }
    };

    public static DocumentType getEnum(String name) {
        if(name.equalsIgnoreCase("Driving license")) {
            return DRIVING_LICENSE;
        } else if (name.equalsIgnoreCase("Vehicle paper")) {
            return VEHICLE_PAPER;
        }
        return null;
    }

    public static String getString(DocumentType documentType) {
        if (documentType.equals(DRIVING_LICENSE)) {
            return DRIVING_LICENSE.toString();
        } else if (documentType.equals(VEHICLE_PAPER)) {
            return VEHICLE_PAPER.toString();
        }
        return null;
    }
}
