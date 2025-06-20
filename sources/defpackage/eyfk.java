package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyfk {
    DOUBLE(0, 1, eygw.DOUBLE),
    FLOAT(1, 1, eygw.FLOAT),
    INT64(2, 1, eygw.LONG),
    UINT64(3, 1, eygw.LONG),
    INT32(4, 1, eygw.INT),
    FIXED64(5, 1, eygw.LONG),
    FIXED32(6, 1, eygw.INT),
    BOOL(7, 1, eygw.BOOLEAN),
    STRING(8, 1, eygw.STRING),
    MESSAGE(9, 1, eygw.MESSAGE),
    BYTES(10, 1, eygw.BYTE_STRING),
    UINT32(11, 1, eygw.INT),
    ENUM(12, 1, eygw.ENUM),
    SFIXED32(13, 1, eygw.INT),
    SFIXED64(14, 1, eygw.LONG),
    SINT32(15, 1, eygw.INT),
    SINT64(16, 1, eygw.LONG),
    GROUP(17, 1, eygw.MESSAGE),
    DOUBLE_LIST(18, 2, eygw.DOUBLE),
    FLOAT_LIST(19, 2, eygw.FLOAT),
    INT64_LIST(20, 2, eygw.LONG),
    UINT64_LIST(21, 2, eygw.LONG),
    INT32_LIST(22, 2, eygw.INT),
    FIXED64_LIST(23, 2, eygw.LONG),
    FIXED32_LIST(24, 2, eygw.INT),
    BOOL_LIST(25, 2, eygw.BOOLEAN),
    STRING_LIST(26, 2, eygw.STRING),
    MESSAGE_LIST(27, 2, eygw.MESSAGE),
    BYTES_LIST(28, 2, eygw.BYTE_STRING),
    UINT32_LIST(29, 2, eygw.INT),
    ENUM_LIST(30, 2, eygw.ENUM),
    SFIXED32_LIST(31, 2, eygw.INT),
    SFIXED64_LIST(32, 2, eygw.LONG),
    SINT32_LIST(33, 2, eygw.INT),
    SINT64_LIST(34, 2, eygw.LONG),
    DOUBLE_LIST_PACKED(35, 3, eygw.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, eygw.FLOAT),
    INT64_LIST_PACKED(37, 3, eygw.LONG),
    UINT64_LIST_PACKED(38, 3, eygw.LONG),
    INT32_LIST_PACKED(39, 3, eygw.INT),
    FIXED64_LIST_PACKED(40, 3, eygw.LONG),
    FIXED32_LIST_PACKED(41, 3, eygw.INT),
    BOOL_LIST_PACKED(42, 3, eygw.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, eygw.INT),
    ENUM_LIST_PACKED(44, 3, eygw.ENUM),
    SFIXED32_LIST_PACKED(45, 3, eygw.INT),
    SFIXED64_LIST_PACKED(46, 3, eygw.LONG),
    SINT32_LIST_PACKED(47, 3, eygw.INT),
    SINT64_LIST_PACKED(48, 3, eygw.LONG),
    GROUP_LIST(49, 2, eygw.MESSAGE),
    MAP(50, 4, eygw.VOID);

    private static final eyfk[] aa;
    public final int Z;

    static {
        eyfk[] values = values();
        aa = new eyfk[values.length];
        for (eyfk eyfkVar : values) {
            aa[eyfkVar.Z] = eyfkVar;
        }
    }

    eyfk(int i, int i2, eygw eygwVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = eygwVar.k;
        }
        if (i2 == 1) {
            eygw eygwVar2 = eygw.VOID;
            eygwVar.ordinal();
        }
    }
}
