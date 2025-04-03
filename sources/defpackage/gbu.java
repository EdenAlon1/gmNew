package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbu extends ffkk implements ffjm {
    final /* synthetic */ haq a;
    final /* synthetic */ ffji b;
    final /* synthetic */ long c;
    final /* synthetic */ Long d;
    final /* synthetic */ fzr e;
    final /* synthetic */ Locale f;
    final /* synthetic */ int g;
    final /* synthetic */ gae h;
    final /* synthetic */ dmug i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbu(haq haqVar, ffji ffjiVar, long j, Long l, gae gaeVar, dmug dmugVar, fzr fzrVar, Locale locale, int i) {
        super(2);
        this.a = haqVar;
        this.b = ffjiVar;
        this.c = j;
        this.d = l;
        this.h = gaeVar;
        this.i = dmugVar;
        this.e = fzrVar;
        this.f = locale;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gcy.o(this.a, this.b, this.c, this.d, this.h, this.i, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
