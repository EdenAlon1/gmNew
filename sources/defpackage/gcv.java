package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcv extends ffkk implements ffix {
    final /* synthetic */ Long a;
    final /* synthetic */ Long b;
    final /* synthetic */ ffmj c;
    final /* synthetic */ int d;
    final /* synthetic */ Locale e;
    final /* synthetic */ dmug f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcv(Long l, Long l2, ffmj ffmjVar, int i, dmug dmugVar, Locale locale) {
        super(0);
        this.a = l;
        this.b = l2;
        this.c = ffmjVar;
        this.d = i;
        this.f = dmugVar;
        this.e = locale;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new gdc(this.a, this.b, this.c, this.d, this.f, this.e);
    }
}
