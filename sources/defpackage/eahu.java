package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahu {
    public static final entd a = entd.c("GnpSdk");

    public static final emxc a(byte[] bArr) {
        return emxc.i(b(bArr));
    }

    public static final /* synthetic */ exwl b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (exwl) eyfy.parseFrom(exwl.a, bArr, eyfc.a());
        } catch (eygu e) {
            ((ensz) ((ensz) a.i()).g(e)).q("Failed to parse AndroidPayload proto.");
            return null;
        }
    }
}
