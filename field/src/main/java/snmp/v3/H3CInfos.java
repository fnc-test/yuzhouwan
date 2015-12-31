package snmp.v3;

/**
 * Copyright @ yuzhouwan
 * All right reserved.
 * Function：snmp v3 user informations
 *
 * @author jinjy
 * @since 2015/12/31 0031
 */
public class H3CInfos {

    private H3CSnmpV3User h3CSnmpV3User;
    String userName4USM;
    private H3CUserTarget h3CUserTarget;

    public H3CInfos(H3CSnmpV3User h3CSnmpV3User, String userName4USM, H3CUserTarget h3CUserTarget) {
        this.h3CSnmpV3User = h3CSnmpV3User;
        this.userName4USM = userName4USM;
        this.h3CUserTarget = h3CUserTarget;
    }

    public H3CSnmpV3User getH3CSnmpV3User() {
        return h3CSnmpV3User;
    }

    public String getUserName4USM() {
        return userName4USM;
    }

    public H3CUserTarget getH3CUserTarget() {
        return h3CUserTarget;
    }
}
