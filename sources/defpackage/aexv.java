package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aexv {
    private final ffbr a;
    private final errl b;

    public aexv(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = errlVar;
    }

    public final elfl a(final eokv eokvVar, final ConversationIdType conversationIdType) {
        return ((Boolean) aexw.a.e()).booleanValue() ? elfo.e(null) : !aewg.h() ? elfo.e(null) : ((ahik) this.a.b()).b().h(new emwl() { // from class: aexr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cxkc cxkcVar = (cxkc) obj;
                if (cxkcVar == null || !cxkcVar.c()) {
                    return null;
                }
                final ConversationIdType conversationIdType2 = ConversationIdType.this;
                brry a = brsd.a();
                a.z("addLabelsToBugleConversation");
                a.d(new Function() { // from class: aexs
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brsc brscVar = (brsc) obj2;
                        brscVar.b(ConversationIdType.this);
                        return brscVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a.c(new Function() { // from class: aext
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((brrd) obj2).c;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brrf brrfVar = (brrf) a.b().p(brsd.c.c);
                try {
                    engw g = brrfVar.g();
                    eokv eokvVar2 = eokvVar;
                    brrfVar.close();
                    Stream map = Collection.EL.stream(g).distinct().sorted().map(new Function() { // from class: aexu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return aeya.b(SuperSortLabel.a(((Integer) obj2).intValue()));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    engw engwVar = (engw) map.collect(endq.a);
                    eokvVar2.copyOnWrite();
                    eokw eokwVar = (eokw) eokvVar2.instance;
                    eokw eokwVar2 = eokw.a;
                    eygi eygiVar = eokwVar.F;
                    if (!eygiVar.c()) {
                        eokwVar.F = eyfy.mutableCopy(eygiVar);
                    }
                    Iterator<E> it = engwVar.iterator();
                    while (it.hasNext()) {
                        eokwVar.F.h(((eqjv) it.next()).i);
                    }
                    return null;
                } catch (Throwable th) {
                    try {
                        brrfVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.b);
    }
}
