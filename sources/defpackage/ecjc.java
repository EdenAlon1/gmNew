package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecjc {
    public final eciz a;
    public final ffbr b;
    public final ecsz c;
    public final ffbr d;
    public final fazb e;
    private final ecdn f;
    private final Executor g;

    public ecjc(eciz ecizVar, ffbr ffbrVar, ecdn ecdnVar, ecta ectaVar, final ffbr ffbrVar2, Executor executor, fazb fazbVar, ffbr ffbrVar3) {
        this.a = ecizVar;
        this.f = ecdnVar;
        this.b = ffbrVar;
        this.g = executor;
        this.d = new ffbr() { // from class: ecja
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                ffbr ffbrVar4 = ffbr.this;
                if (!((emxc) ffbrVar4.b()).g()) {
                    return null;
                }
                return null;
            }
        };
        Context context = (Context) ectaVar.a.b();
        context.getClass();
        Executor executor2 = (Executor) ectaVar.b.b();
        executor2.getClass();
        ectd ectdVar = (ectd) ectaVar.c.b();
        ectdVar.getClass();
        Boolean bool = (Boolean) ectaVar.d.b();
        bool.getClass();
        this.c = new ecsz(context, executor2, ectdVar, fazbVar, bool.booleanValue(), (emxc) ((fbbb) ectaVar.e).a, ffbrVar3);
        this.e = fazbVar;
    }

    public final long a(String str) {
        if (!this.f.a) {
            ecsz ecszVar = this.c;
            if (ecszVar.c.c()) {
                return -1L;
            }
            boolean z = ecszVar.b;
            ecte ecteVar = ecszVar.a;
            if (z) {
                return ecteVar.a(str);
            }
        }
        return -1L;
    }

    public final ListenableFuture b(final eciv ecivVar) {
        return this.f.a ? erqt.g() : erqt.n(new erog() { // from class: ecjb
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:151:0x058d  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x05f6  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x0629  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x0646  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x0696  */
            /* JADX WARN: Removed duplicated region for block: B:179:0x06c8  */
            /* JADX WARN: Removed duplicated region for block: B:181:0x06e3  */
            /* JADX WARN: Removed duplicated region for block: B:182:0x05fa  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x05b3  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x02dd A[LOOP:1: B:73:0x02da->B:75:0x02dd, LOOP_END] */
            @Override // defpackage.erog
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 1764
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ecjb.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }

    public final boolean d() {
        ecsz ecszVar = this.c;
        return ecszVar.b && ecszVar.a.d();
    }
}
