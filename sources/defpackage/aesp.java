package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesp extends alhh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesp(ffbr ffbrVar, aesj aesjVar, Executor executor) {
        super(ffbrVar, aesjVar, executor);
        ffbrVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        final aesn aesnVar = aesn.a;
        return new BiConsumer() { // from class: aeso
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ffjm.this.a(obj, obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final druc drucVar, final boolean z, final String str) {
        drucVar.getClass();
        str.getClass();
        o(new Supplier() { // from class: aesl
            @Override // java.util.function.Supplier
            public final Object get() {
                int i;
                eqcl eqclVar = (eqcl) eqcm.a.createBuilder();
                eqclVar.getClass();
                eqcp eqcpVar = (eqcp) eqcs.a.createBuilder();
                eqcpVar.getClass();
                eqco a = aesf.a(z, str);
                eqcpVar.copyOnWrite();
                eqcs eqcsVar = (eqcs) eqcpVar.instance;
                eqcsVar.c = a;
                eqcsVar.b |= 1;
                druc drucVar2 = drucVar;
                if (drucVar2 instanceof drty) {
                    i = 2;
                } else if (drucVar2 instanceof drua) {
                    i = 3;
                } else if (drucVar2 instanceof drub) {
                    i = 4;
                } else {
                    if (!(drucVar2 instanceof drtz)) {
                        throw new ffcd();
                    }
                    i = 5;
                }
                eqcpVar.copyOnWrite();
                eqcs eqcsVar2 = (eqcs) eqcpVar.instance;
                eqcsVar2.d = i - 1;
                eqcsVar2.b |= 2;
                int i2 = true == drucVar2.a ? 2 : 3;
                eqcpVar.copyOnWrite();
                eqcs eqcsVar3 = (eqcs) eqcpVar.instance;
                eqcsVar3.e = i2 - 1;
                eqcsVar3.b |= 4;
                eyfy build = eqcpVar.build();
                build.getClass();
                eqclVar.copyOnWrite();
                eqcm eqcmVar = (eqcm) eqclVar.instance;
                eqcmVar.c = (eqcs) build;
                eqcmVar.b = 2;
                return eqrj.a(eqclVar);
            }
        });
    }

    public final void c(final drtx drtxVar) {
        o(new Supplier() { // from class: aesm
            @Override // java.util.function.Supplier
            public final Object get() {
                int i;
                eqcl eqclVar = (eqcl) eqcm.a.createBuilder();
                eqclVar.getClass();
                eqct eqctVar = (eqct) eqcv.a.createBuilder();
                eqctVar.getClass();
                drtx drtxVar2 = drtx.this;
                if (drtxVar2 instanceof drtw) {
                    i = 2;
                } else if (drtxVar2 instanceof drtv) {
                    i = 3;
                } else {
                    if (!(drtxVar2 instanceof drtu)) {
                        throw new ffcd();
                    }
                    i = 4;
                }
                eqctVar.copyOnWrite();
                eqcv eqcvVar = (eqcv) eqctVar.instance;
                eqcvVar.c = i - 1;
                eqcvVar.b |= 1;
                drsq drsqVar = drtxVar2.a;
                eqctVar.copyOnWrite();
                eqcv eqcvVar2 = (eqcv) eqctVar.instance;
                eqcvVar2.d = drsqVar.e;
                eqcvVar2.b |= 2;
                eyfy build = eqctVar.build();
                build.getClass();
                eqclVar.copyOnWrite();
                eqcm eqcmVar = (eqcm) eqclVar.instance;
                eqcmVar.c = (eqcv) build;
                eqcmVar.b = 3;
                return eqrj.a(eqclVar);
            }
        });
    }
}
