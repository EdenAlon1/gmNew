package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amzm implements amyl {
    public static final anki a;
    private static final cfva g = cfvl.n(cfvl.b, "use_guessed_min_match_value", false);
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final Locale f;
    private final Context h;
    private final ffsk i;
    private final ffsk j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final entd o;

    static {
        Object apply;
        Object apply2;
        String[] strArr = ankj.a;
        anki ankiVar = new anki();
        Function[] functionArr = {new Function() { // from class: amyw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                anki ankiVar2 = (anki) obj;
                anki ankiVar3 = amzm.a;
                int intValue = ankj.c().intValue();
                if (intValue < 10007) {
                    dtub.w("conv_type", intValue);
                }
                ankiVar2.aq(new dtwe("conversations.conv_type", 2, 2));
                return ankiVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: amyx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                anki ankiVar2 = (anki) obj;
                anki ankiVar3 = amzm.a;
                int intValue = ankj.c().intValue();
                if (intValue < 10006) {
                    dtub.w("join_state", intValue);
                }
                ankiVar2.aq(new dtwe("conversations.join_state", 1, 0));
                return ankiVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        anki[] ankiVarArr = new anki[2];
        for (int i = 0; i < 2; i++) {
            apply2 = functionArr[i].apply(new anki());
            ankiVarArr[i] = (anki) apply2;
        }
        ankiVar.ar(ankiVarArr);
        a = ankiVar;
        int i2 = anva.a;
        anuz anuzVar = new anuz();
        Function[] functionArr2 = {new Function() { // from class: amyy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                anuz anuzVar2 = (anuz) obj;
                anki ankiVar2 = amzm.a;
                int intValue = anva.b().intValue();
                if (intValue < 10007) {
                    dtub.w("conv_type", intValue);
                }
                anuzVar2.aq(new dtwe("conversations.conv_type", 2, 2));
                return anuzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: amyz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                anuz anuzVar2 = (anuz) obj;
                anki ankiVar2 = amzm.a;
                int intValue = anva.b().intValue();
                if (intValue < 10006) {
                    dtub.w("join_state", intValue);
                }
                anuzVar2.aq(new dtwe("conversations.join_state", 1, 0));
                return anuzVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        anuz[] anuzVarArr = new anuz[2];
        for (int i3 = 0; i3 < 2; i3++) {
            apply = functionArr2[i3].apply(new anuz());
            anuzVarArr[i3] = (anuz) apply;
        }
        anuzVar.ar(anuzVarArr);
    }

    public amzm(Context context, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        this.h = context;
        this.i = ffskVar;
        this.j = ffskVar2;
        this.b = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.c = ffbrVar6;
        this.d = ffbrVar7;
        this.e = ffbrVar8;
        this.f = ctid.c(context);
        this.o = entd.c("BugleConversation");
    }

    private final elfl e(engw engwVar, Optional optional, boolean z, boolean z2, Integer num, boolean z3, boolean z4) {
        elfl c;
        ekzz f = eleg.f("ConversationSearcherImpl#findConversationExactMatch");
        try {
            ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
            Iterator<E> it = engwVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((Recipient) it.next()).g());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String n = ((aoku) it2.next()).n();
                if (n != null) {
                    arrayList2.add(n);
                }
            }
            engw a2 = engq.a(arrayList2);
            ((ensz) this.o.e()).u("requiredDestination size is: %s, requiredRecipient size is: %s", a2.size(), engwVar.size());
            if (!a2.isEmpty()) {
                c = axol.c(this.i, ffhe.a, ffsm.a, new amzj(this, a2, optional, z, z2, num, z3, z4, null));
                ffig.a(f, null);
                return c;
            }
            ((ensz) this.o.j()).q("Unable to findConversationExactMatch: Empty destination list.");
            elfl d = elfo.d(new IllegalArgumentException("Unable to findConversationExactMatch: Empty destination list."));
            d.getClass();
            ffig.a(f, null);
            return d;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.amyl
    public final elfl a(anvc anvcVar) {
        ekzz f;
        elfl c;
        elfl c2;
        int i = anvcVar.h - 1;
        if (i == 0) {
            return e(anvcVar.a, anvcVar.c, anvcVar.d, true, anvcVar.e, anvcVar.f, anvcVar.g);
        }
        if (i == 1) {
            engw engwVar = anvcVar.a;
            engw engwVar2 = anvcVar.b;
            Optional optional = anvcVar.c;
            boolean z = anvcVar.d;
            Integer num = anvcVar.e;
            boolean z2 = anvcVar.f;
            boolean z3 = anvcVar.g;
            f = eleg.f("ConversationSearcherImpl#findConversationPartialMatch");
            try {
                ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
                Iterator<E> it = engwVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Recipient) it.next()).g());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String n = ((aoku) it2.next()).n();
                    if (n != null) {
                        arrayList2.add(n);
                    }
                }
                engw a2 = engq.a(arrayList2);
                ArrayList arrayList3 = new ArrayList(ffdx.n(engwVar2, 10));
                Iterator<E> it3 = engwVar2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Recipient) it3.next()).g());
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    String n2 = ((aoku) it4.next()).n();
                    if (n2 != null) {
                        arrayList4.add(n2);
                    }
                }
                engw a3 = engq.a(arrayList4);
                ((ensz) this.o.e()).K("requiredDestination size is: %s, requiredRecipient size is: %s, optionalDestination size is: %s, optionalRecipient size is: %s", Integer.valueOf(a2.size()), Integer.valueOf(engwVar.size()), Integer.valueOf(a3.size()), Integer.valueOf(engwVar2.size()));
                if (!a2.isEmpty() || !a3.isEmpty() || optional.isPresent()) {
                    c = axol.c(this.i, ffhe.a, ffsm.a, new amzk(this, a2, a3, optional, z, num, z2, z3, null));
                    ffig.a(f, null);
                    return c;
                }
                ((ensz) this.o.j()).q("Unable to findConversationPartialMatch: Empty destination list and name.");
                elfl d = elfo.d(new IllegalArgumentException("Unable to findConversationPartialMatch: Empty destination list and name."));
                d.getClass();
                ffig.a(f, null);
                return d;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        if (i != 2) {
            return e(anvcVar.a, anvcVar.c, anvcVar.d, false, null, anvcVar.f, anvcVar.g);
        }
        engw engwVar3 = anvcVar.a;
        boolean z4 = anvcVar.g;
        f = eleg.f("ConversationSearcherImpl#findConversationBestMatch");
        try {
            if (engwVar3.isEmpty()) {
                ((ensz) this.o.j()).q("Unable to findConversationBestMatch: Empty recipient list.");
                elfl d2 = elfo.d(new IllegalArgumentException("Unable to findConversationBestMatch: Empty recipient list."));
                d2.getClass();
                ffig.a(f, null);
                return d2;
            }
            ArrayList arrayList5 = new ArrayList(ffdx.n(engwVar3, 10));
            Iterator<E> it5 = engwVar3.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((Recipient) it5.next()).g());
            }
            List X = ffdx.X(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : X) {
                ((aoku) obj).o();
                arrayList6.add(obj);
            }
            c2 = axol.c(this.j, ffhe.a, ffsm.a, new amzi(((ayif) this.k.b()).k(engq.a(arrayList6)), this, z4, null));
            ffig.a(f, null);
            return c2;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r6 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r6 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.amzl
            if (r0 == 0) goto L13
            r0 = r6
            amzl r0 = (defpackage.amzl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amzl r0 = new amzl
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r6)
            goto L9a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.ffci.b(r6)
            goto L5e
        L36:
            defpackage.ffci.b(r6)
            cfva r6 = defpackage.amzm.g
            java.lang.Object r6 = r6.e()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L8b
            ffbr r6 = r5.n
            java.lang.Object r6 = r6.b()
            ayyi r6 = (defpackage.ayyi) r6
            elfl r6 = r6.a()
            r6.getClass()
            r0.c = r4
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L9e
        L5e:
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r6.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 6
            if (r0 < r1) goto L81
            java.lang.Object r6 = r6.get()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L85
        L81:
            int r6 = defpackage.ayvs.a()
        L85:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            return r0
        L8b:
            elfl r6 = defpackage.ayvs.b()
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L9e
        L9a:
            r6.getClass()
            return r6
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amzm.b(ffgu):java.lang.Object");
    }

    public final boolean c(boolean z, ConversationIdType conversationIdType) {
        return ((auvu) this.d.b()).a() && z && !((amoe) this.e.b()).e(conversationIdType);
    }

    public final boolean d(enip enipVar, String str, int i) {
        ekzz f = eleg.f("ConversationSearcherImpl#isParticipantsIncluding");
        try {
            enqu listIterator = enipVar.listIterator();
            listIterator.getClass();
            while (listIterator.hasNext()) {
                if (((ayvs) this.m.b()).f((String) listIterator.next(), str, i, ((ctve) this.l.b()).a()) != 4) {
                    ffig.a(f, null);
                    return true;
                }
            }
            ffig.a(f, null);
            return false;
        } finally {
        }
    }
}
