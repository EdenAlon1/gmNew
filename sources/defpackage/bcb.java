package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bcb {
    public static void a(bcd bcdVar, bif bifVar) {
        int i = bcdVar.i();
        if (i == 1) {
            return;
        }
        int i2 = i - 1;
        int i3 = i2 != 1 ? i2 != 2 ? 1 : 0 : 32;
        if ((i3 & 1) == 1) {
            bifVar.b("LightSource", "4");
        }
        bifVar.b("Flash", String.valueOf(i3));
    }
}
