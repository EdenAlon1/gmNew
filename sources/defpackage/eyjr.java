package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyjr {
    DOUBLE(eyjs.DOUBLE, 1),
    FLOAT(eyjs.FLOAT, 5),
    INT64(eyjs.LONG, 0),
    UINT64(eyjs.LONG, 0),
    INT32(eyjs.INT, 0),
    FIXED64(eyjs.LONG, 1),
    FIXED32(eyjs.INT, 5),
    BOOL(eyjs.BOOLEAN, 0),
    STRING(eyjs.STRING, 2),
    GROUP(eyjs.MESSAGE, 3),
    MESSAGE(eyjs.MESSAGE, 2),
    BYTES(eyjs.BYTE_STRING, 2),
    UINT32(eyjs.INT, 0),
    ENUM(eyjs.ENUM, 0),
    SFIXED32(eyjs.INT, 5),
    SFIXED64(eyjs.LONG, 1),
    SINT32(eyjs.INT, 0),
    SINT64(eyjs.LONG, 0);

    public final eyjs s;
    public final int t;

    eyjr(eyjs eyjsVar, int i) {
        this.s = eyjsVar;
        this.t = i;
    }
}
