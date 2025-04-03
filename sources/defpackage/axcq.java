package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcq {
    private static final enhk a = enhk.p(1, enhk.n(Integer.valueOf(ccue.a(17)), epdw.MESSAGE_BACKUP, Integer.valueOf(ccue.a(33)), epdw.MESSAGE_UPDATE, Integer.valueOf(ccue.a(9)), epdw.MESSAGE_DELETE), 5, enhk.o(Integer.valueOf(ccrk.a(3)), epdw.PARTS_FREQ_UPDATE, Integer.valueOf(ccrk.a(5)), epdw.PARTS_RARE_UPDATE, Integer.valueOf(ccrk.a(4)), epdw.PARTS_CUSTOM_PART_FLAG_URI_UPDATE, Integer.valueOf(ccue.a(9)), epdw.PARTS_DELETE), 7, enhk.o(Integer.valueOf(cclk.c(1)), epdw.KEY_BACKUP, Integer.valueOf(cclk.c(3)), epdw.KEY_BACKUP, Integer.valueOf(cclk.c(2)), epdw.KEY_BACKUP, 2, epdw.KEY_DELETE), 2, enhk.o(Integer.valueOf(ccue.a(3)), epdw.CONVERSATION_FREQ_UPDATE, Integer.valueOf(ccue.a(5)), epdw.CONVERSATION_RARE_UPDATE, Integer.valueOf(ccue.a(17)), epdw.CONVERSATION_BACKUP, Integer.valueOf(ccue.a(9)), epdw.CONVERSATION_DELETE), 3, enhk.n(Integer.valueOf(ccue.a(5)), epdw.PARTICIPANT_RARE_UPDATE, Integer.valueOf(ccue.a(17)), epdw.PARTICIPANT_BACKUP, Integer.valueOf(ccue.a(9)), epdw.PARTICIPANT_DELETE));

    public static epdw a(int i, int i2) {
        return (epdw) Map.EL.getOrDefault((java.util.Map) a.getOrDefault(Integer.valueOf(i), enoz.a), Integer.valueOf(i2), epdw.UNSPECIFIED_BACKUP_TYPE);
    }
}
