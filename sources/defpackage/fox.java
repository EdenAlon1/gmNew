package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fox {
    public static final /* synthetic */ hkx a(boolean z, dwn dwnVar, fjj fjjVar, float f, float f2, hfd hfdVar, int i) {
        hfd hfdVar2;
        hkx a;
        hkx a2;
        hkx a3 = dwj.a(dwnVar, hfdVar, (i >> 6) & 14);
        hfdVar.v(998675979);
        long j = !z ? fjjVar.c : ((Boolean) dwj.a(dwnVar, hfdVar, ((i & 8190) >> 6) & 14).a()).booleanValue() ? fjjVar.a : fjjVar.b;
        if (z) {
            hfdVar.v(1613369407);
            hfdVar2 = hfdVar;
            a = cwo.b(j, cxu.c(150, 0, null, 6), hfdVar2, 48, 12);
            hfdVar2.o();
        } else {
            hfdVar2 = hfdVar;
            hfdVar2.v(1613472265);
            a = hku.a(new ibw(j), hfdVar2);
            hfdVar2.o();
        }
        hfdVar2.o();
        if (true != ((Boolean) a3.a()).booleanValue()) {
            f = f2;
        }
        if (z) {
            hfdVar2.v(772204030);
            a2 = cxo.b(f, cxu.c(150, 0, null, 6), hfdVar2, 48, 12);
            hfdVar2.o();
        } else {
            hfdVar2.v(772308252);
            a2 = hku.a(new jzq(f2), hfdVar2);
            hfdVar2.o();
        }
        return hku.a(new der(((jzq) a2.a()).a, new idl(((ibw) a.a()).i)), hfdVar2);
    }
}
