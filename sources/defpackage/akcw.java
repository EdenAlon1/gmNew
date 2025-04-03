package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akcw {
    public static final /* synthetic */ akcv a(akcj akcjVar) {
        eyfy build = akcjVar.build();
        build.getClass();
        return (akcv) build;
    }

    public static final void b(long j, akcj akcjVar) {
        akcjVar.copyOnWrite();
        akcv akcvVar = (akcv) akcjVar.instance;
        akcv akcvVar2 = akcv.a;
        akcvVar.b |= 2;
        akcvVar.f = j;
    }

    public static final void c(eyee eyeeVar, akcj akcjVar) {
        akcjVar.copyOnWrite();
        akcv akcvVar = (akcv) akcjVar.instance;
        akcv akcvVar2 = akcv.a;
        akcvVar.b |= 1;
        akcvVar.e = eyeeVar;
    }
}
