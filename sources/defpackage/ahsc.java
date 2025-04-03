package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsc implements cgoo {
    public final ffhd a;
    private final ffsk b;

    public ahsc(ffsk ffskVar, ffhd ffhdVar, dtve dtveVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        dtveVar.getClass();
        ffbrVar.getClass();
        this.b = ffskVar;
        this.a = ffhdVar;
    }

    @Override // defpackage.cgoo
    public final elfl a(MessageIdType messageIdType, List list) {
        elfl c;
        messageIdType.getClass();
        list.getClass();
        c = axol.c(this.b, ffhe.a, ffsm.a, new ahsb(this, messageIdType, list, null));
        return c;
    }

    @Override // defpackage.cgoo
    public final void b(final MessageIdType messageIdType) {
        efbd.b();
        String[] strArr = btvy.a;
        btvo btvoVar = new btvo();
        btvoVar.f("deleteNudges#messageclassifications");
        btvoVar.c(new Function() { // from class: ahrx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btvx btvxVar = (btvx) obj;
                btvxVar.c(fbrc.NUDGE_CLASSIFICATION);
                btvxVar.d(MessageIdType.this);
                return btvxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btvoVar.d();
    }

    @Override // defpackage.cgoo
    public final void c() {
        d(true, true);
    }

    @Override // defpackage.cgoo
    public final void d(boolean z, boolean z2) {
        efbd.b();
        if (z) {
            String[] strArr = btvy.a;
            btvo btvoVar = new btvo();
            btvoVar.f("deleteNudges#messageclassifications");
            btvoVar.c(new Function() { // from class: ahry
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btvx btvxVar = (btvx) obj;
                    btvxVar.c(fbrc.NUDGE_CLASSIFICATION);
                    return btvxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            btvoVar.d();
        }
        if (z2) {
            String[] strArr2 = brbs.a;
            brbj brbjVar = new brbj();
            brbjVar.f("deleteNudges#conversationclassififications");
            brbjVar.c(new Function() { // from class: ahrz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brbr brbrVar = (brbr) obj;
                    brbrVar.c(axcl.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                    return brbrVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brbjVar.d();
        }
    }

    @Override // defpackage.cgoo
    public final boolean e(MessageIdType messageIdType, List list) {
        messageIdType.getClass();
        if (dkta.a(list)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fbwv fbwvVar = (fbwv) it.next();
            String[] strArr = btvy.a;
            btuv btuvVar = new btuv();
            btuvVar.d(messageIdType);
            fbrc b = fbrc.b(fbwvVar.d);
            if (b == null) {
                b = fbrc.UNRECOGNIZED;
            }
            btuvVar.c(b);
            btuvVar.b(fbwvVar);
            arrayList.add(btuvVar.a());
        }
        btus[] btusVarArr = (btus[]) arrayList.toArray(new btus[0]);
        long[] A = dtub.A(btvy.b(), 0, true, new BiConsumer() { // from class: btuq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                btus btusVar = (btus) obj;
                Long l = (Long) obj2;
                String[] strArr2 = btvy.a;
                if (l.longValue() >= 0) {
                    btusVar.a = new btup(l).a.longValue();
                    btusVar.fY(0);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, (btus[]) Arrays.copyOf(btusVarArr, btusVarArr.length));
        if (A == null) {
            return false;
        }
        for (long j : A) {
            if (j <= 0) {
                return false;
            }
        }
        return true;
    }
}
