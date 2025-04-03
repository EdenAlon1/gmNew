package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class decs implements dgtt {
    public final cqoh a;
    private final Optional b;
    private final errl c;
    private ListIterator d;
    private boolean e = false;

    public decs(Optional optional, errl errlVar, cqoh cqohVar) {
        this.b = optional;
        this.c = errlVar;
        int i = engw.d;
        this.d = enou.a.iterator();
        this.a = cqohVar;
    }

    @Override // defpackage.dgtt
    public final void a(dgts dgtsVar) {
        elfo.g(new Callable() { // from class: decp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return decs.this.c();
            }
        }, this.c).k(axou.a(new decr(dgtsVar)), this.c);
    }

    @Override // defpackage.dgtt
    public final void b() {
        this.b.ifPresent(new Consumer() { // from class: decq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cfyq) obj).c(decs.this.a.f().toEpochMilli() - ((Long) cfyp.d.e()).longValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final synchronized ListIterator c() {
        if (this.e) {
            return this.d;
        }
        this.b.isPresent();
        this.b.get();
        bvfe a = bvfh.a();
        a.z("getP2pSuggestionEvents");
        a.r();
        engw x = a.b().x(new emwl() { // from class: adgz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bvek bvekVar;
                engw g;
                int i;
                engw g2;
                bvek bvekVar2 = (bvek) obj;
                MessageIdType g3 = bvekVar2.g();
                String l = bvekVar2.l();
                if (l == null) {
                    throw new NullPointerException("Null id");
                }
                eoqz h = bvekVar2.h();
                if (h == null) {
                    throw new NullPointerException("Null eventType");
                }
                epjp i2 = bvekVar2.i();
                if (i2 == null) {
                    throw new NullPointerException("Null replyMode");
                }
                fbqp j = bvekVar2.j();
                if (j == null) {
                    throw new NullPointerException("Null actionSource");
                }
                fbqx k = bvekVar2.k();
                if (k == null) {
                    throw new NullPointerException("Null rejectionReason");
                }
                int e = bvekVar2.e();
                int c = bvekVar2.c();
                long f = bvekVar2.f();
                String b = emxe.b(bvekVar2.m());
                String o = bvekVar2.o();
                if (o == null) {
                    int i3 = engw.d;
                    g = enou.a;
                    bvekVar = bvekVar2;
                } else {
                    int i4 = engw.d;
                    engr engrVar = new engr();
                    String[] split = o.split(",", 0);
                    int length = split.length;
                    bvekVar = bvekVar2;
                    int i5 = 0;
                    while (i5 < length) {
                        String str = split[i5];
                        if (str.isEmpty()) {
                            i = i5;
                        } else {
                            i = i5;
                            engrVar.h(Long.valueOf(str));
                        }
                        i5 = i + 1;
                    }
                    g = engrVar.g();
                }
                if (g == null) {
                    throw new NullPointerException("Null suggestionTypes");
                }
                String n = bvekVar.n();
                if (n == null) {
                    g2 = enou.a;
                } else {
                    engr engrVar2 = new engr();
                    int i6 = 0;
                    String[] split2 = n.split(",", 0);
                    int length2 = split2.length;
                    while (i6 < length2) {
                        String[] strArr = split2;
                        String str2 = strArr[i6];
                        if (!str2.isEmpty()) {
                            engrVar2.h(str2);
                        }
                        i6++;
                        split2 = strArr;
                    }
                    g2 = engrVar2.g();
                }
                engw engwVar = g2;
                if (engwVar != null) {
                    return new cfyr(l, h, i2, j, k, e, c, f, b, g, engwVar, g3);
                }
                throw new NullPointerException("Null modelOutputLabels");
            }
        });
        this.e = true;
        enqv it = x.iterator();
        this.d = it;
        return it;
    }

    @Override // defpackage.dgtt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
