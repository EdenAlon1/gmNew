package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class you implements yna, ybu, abqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/text/DraftTextUiAdapterImpl");
    public final Context b;
    public final ffsk c;
    public final ydb d;
    public final Optional e;
    public final aleq f;
    public final atbn g;
    public final atbr h;
    public final atdr i;
    public final atby j;
    public final AtomicInteger k;
    public final fgcl l;
    public final dsjn m;
    public final dqmn n;
    private final ffsk o;
    private final ffbz p;
    private final fgdj q;
    private final fgdj r;
    private final fgdj s;
    private final yos t;
    private final fgdj u;

    public you(Context context, ffsk ffskVar, ffsk ffskVar2, ydb ydbVar, yrn yrnVar, final ffbr ffbrVar, Optional optional, fgcq fgcqVar, xgl xglVar, aleq aleqVar, atbn atbnVar, atbr atbrVar, atdr atdrVar, atby atbyVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ydbVar.getClass();
        optional.getClass();
        fgcqVar.getClass();
        aleqVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.o = ffskVar2;
        this.d = ydbVar;
        this.e = optional;
        this.f = aleqVar;
        this.g = atbnVar;
        this.h = atbrVar;
        this.i = atdrVar;
        this.j = atbyVar;
        this.k = new AtomicInteger();
        this.p = ffca.a(new ffix() { // from class: ynb
            @Override // defpackage.ffix
            public final Object invoke() {
                return ((alxs) ffbr.this.b()).a();
            }
        });
        this.l = fgcu.e(0, 1, 3, 1);
        yoa yoaVar = new yoa(new ynx(fgcqVar));
        int i = fgcz.a;
        fgdj b = fgbn.b(yoaVar, ffskVar, fgcy.b, null);
        this.q = b;
        fgdj b2 = fgbn.b(new yog(new yod(fgcqVar)), ffskVar, fgcy.b, "");
        this.r = b2;
        fgdj b3 = fgbn.b(new yom(new yoj(fgcqVar)), ffskVar, fgcy.b, null);
        this.s = b3;
        yos yosVar = new yos(this);
        this.t = yosVar;
        dsjn dsjnVar = new dsjn(yosVar, yrnVar.a(), xglVar);
        this.m = dsjnVar;
        this.n = dsjnVar.f;
        ffxx b4 = fgck.b(new yop(ydbVar.a), b2, b3, b, new yot(this, null));
        fgcz fgczVar = fgcy.b;
        String str = ((xhu) ydbVar.a.c()).a;
        this.u = fgbn.b(b4, ffskVar, fgczVar, new dmmp(dsjnVar, (CharSequence) (str != null ? str : ""), (String) b2.c(), (Integer) b.c(), true, (dmqe) null, new dmmo(atbnVar.a(), atbrVar.a(), atbyVar.a())));
        axol.k(ffskVar, null, new yno(this, null), 3);
        axol.k(ffskVar, null, new ynq(this, null), 3);
        axol.k(ffskVar, null, new yns(this, null), 3);
    }

    @Override // defpackage.ybu
    public final void a() {
        axol.k(this.c, null, new ynu(this, null), 3);
    }

    @Override // defpackage.yna
    public final fgdj b() {
        return this.u;
    }

    public final apmo c() {
        return (apmo) this.p.a();
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        axol.k(this.o, null, new ynt(this, null), 3);
    }
}
