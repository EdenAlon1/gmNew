package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccbw {
    public static final /* synthetic */ ccce a(cccd cccdVar) {
        eyfy build = cccdVar.build();
        build.getClass();
        return (ccce) build;
    }

    public static final void b(int i, cccd cccdVar) {
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccce ccceVar2 = ccce.a;
        ccceVar.b |= 1;
        ccceVar.c = i;
    }

    public static final void c(int i, cccd cccdVar) {
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccce ccceVar2 = ccce.a;
        ccceVar.b |= 8;
        ccceVar.f = i;
    }

    public static final void d(boolean z, cccd cccdVar) {
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccce ccceVar2 = ccce.a;
        ccceVar.b |= 16;
        ccceVar.g = z;
    }

    public static final void e(String str, cccd cccdVar) {
        str.getClass();
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccce ccceVar2 = ccce.a;
        ccceVar.b |= 4;
        ccceVar.e = str;
    }

    public static final void f(int i, cccd cccdVar) {
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccce ccceVar2 = ccce.a;
        ccceVar.b |= 2;
        ccceVar.d = i;
    }
}
