package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cieq implements cifg {
    public static final cskc a = cskc.g("BugleNetwork", "ListConversationsDelegate");
    private static final enhk f;
    public final cgzv b;
    public final ffbr c;
    public final Executor d;
    public final ffbr e;
    private final ffbr g;
    private final chqc h;
    private final errl i;
    private final errl j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(eruv.ACTIVE, cgix.HOME);
        enhdVar.k(eruv.ARCHIVED, cgix.ARCHIVED);
        enhdVar.k(eruv.KEEP_ARCHIVED, cgix.ARCHIVED);
        enhdVar.k(eruv.SPAM_FOLDER, cgix.SPAM_FOLDER);
        enhdVar.k(eruv.BLOCKED_FOLDER, cgix.SPAM_FOLDER);
        f = enhdVar.c();
    }

    public cieq(ffbr ffbrVar, cgzv cgzvVar, chqc chqcVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.g = ffbrVar;
        this.b = cgzvVar;
        this.h = chqcVar;
        this.c = ffbrVar2;
        this.i = errlVar;
        this.j = errlVar2;
        this.e = ffbrVar6;
        this.d = new ersb(errlVar);
        this.k = ffbrVar3;
        this.l = ffbrVar4;
        this.m = ffbrVar5;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    @Override // defpackage.cifg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.elfl b(defpackage.ciff r14, defpackage.eyhs r15) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cieq.b(ciff, eyhs):elfl");
    }

    @Override // defpackage.cifg
    public final /* synthetic */ eyhs c(eyee eyeeVar) {
        return (eryk) eyfy.parseFrom(eryk.a, eyeeVar);
    }

    public final elfl d(final bcyk bcykVar) {
        return this.h.b(bcykVar.Q()).i(new eroh() { // from class: cidx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cieq.this.b.e(bcykVar, (engw) obj);
            }
        }, this.d);
    }

    public final erph e(final bfkf bfkfVar, engw engwVar, final eryk erykVar, final long j, final ConversationIdType conversationIdType) {
        final int a2 = cidb.a();
        final bcrs bcrsVar = (bcrs) this.g.b();
        return elfj.c((engwVar.isEmpty() ? elfo.e((eryl) erym.a.createBuilder()) : elfo.a((engw) Collection.EL.stream(engwVar).map(new Function() { // from class: ciee
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cieq.this.d((bcyk) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a)).h(new emwl() { // from class: cief
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cieq.a;
                eryl erylVar = (eryl) erym.a.createBuilder();
                int i = 0;
                for (erur erurVar : (List) obj) {
                    int i2 = a2;
                    int serializedSize = erurVar.getSerializedSize() + i;
                    if (serializedSize < i2) {
                        erylVar.a(erurVar);
                        i = serializedSize;
                    }
                }
                return erylVar;
            }
        }, this.j)).i(new eroh() { // from class: ciec
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final bfkf bfkfVar2 = bfkfVar;
                final eryl erylVar = (eryl) obj;
                bfkfVar2.dh();
                boolean booleanValue = ((Boolean) ((cfup) bzaq.p.get()).e()).booleanValue();
                eryk erykVar2 = erykVar;
                final bcrs bcrsVar2 = bcrsVar;
                if (!booleanValue || erykVar2.c <= ((Integer) ajhl.a.e()).intValue()) {
                    bfkfVar2.moveToFirst();
                    while (true) {
                        if (bfkfVar2.isAfterLast()) {
                            break;
                        }
                        long j2 = j;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        bcrsVar2.T(bfkfVar2);
                        if (conversationIdType2.equals(bcrsVar2.Q())) {
                            if (bcrsVar2.N() <= j2) {
                                break;
                            }
                            bfkfVar2.moveToNext();
                        } else if (bcrsVar2.N() < j2) {
                            while (bcrsVar2.N() <= j2 && bfkfVar2.moveToPrevious()) {
                                bcrsVar2.T(bfkfVar2);
                            }
                        } else {
                            bfkfVar2.moveToNext();
                        }
                    }
                }
                int sum = Collection.EL.stream(DesugarCollections.unmodifiableList(((erym) erylVar.instance).c)).mapToInt(new ToIntFunction() { // from class: cidy
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj2) {
                        return ((erur) obj2).getSerializedSize();
                    }
                }).sum();
                int i = erykVar2.c;
                if (i == 0) {
                    i = ((Integer) bzaq.g.e()).intValue();
                }
                int i2 = i;
                final ciep ciepVar = new ciep(bfkfVar2, sum);
                elfl e = elfo.e(null);
                int i3 = 0;
                while (true) {
                    final cieq cieqVar = cieq.this;
                    if (i3 >= i2) {
                        return e.h(new emwl() { // from class: cieb
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cskc cskcVar = cieq.a;
                                return eryl.this;
                            }
                        }, cieqVar.d);
                    }
                    final int i4 = a2;
                    e = e.i(new eroh() { // from class: cidz
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            bfkfVar2.dh();
                            ciep ciepVar2 = ciepVar;
                            if (ciepVar2.c || !ciepVar2.a.moveToNext()) {
                                ciepVar2.c = true;
                                return elfo.e(Optional.empty());
                            }
                            bcrs bcrsVar3 = bcrsVar2;
                            cieq cieqVar2 = cieq.this;
                            bcrsVar3.T(ciepVar2.a);
                            return cieqVar2.d(bcrsVar3).h(new emwl() { // from class: cieh
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    return Optional.of((erur) obj3);
                                }
                            }, cieqVar2.d);
                        }
                    }, cieqVar.d).h(new emwl() { // from class: ciea
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Optional optional = (Optional) obj2;
                            cskc cskcVar = cieq.a;
                            ciep ciepVar2 = ciep.this;
                            if (ciepVar2.c || optional.isEmpty()) {
                                return null;
                            }
                            int i5 = i4;
                            bfkfVar2.dh();
                            erur erurVar = (erur) optional.get();
                            int serializedSize = erurVar.getSerializedSize();
                            if (ciepVar2.b + serializedSize < i5) {
                                erylVar.a(erurVar);
                                ciepVar2.b += serializedSize;
                                return null;
                            }
                            ciepVar2.a.moveToPrevious();
                            if (!ciepVar2.a.isBeforeFirst()) {
                                bcrsVar2.T(ciepVar2.a);
                            }
                            ciepVar2.c = true;
                            return null;
                        }
                    }, cieqVar.d);
                    i3++;
                }
            }
        }, this.d).h(new emwl() { // from class: cied
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eryl erylVar = (eryl) obj;
                cskc cskcVar = cieq.a;
                bfkf bfkfVar2 = bfkf.this;
                bfkfVar2.dh();
                if (bfkfVar2.moveToNext() && ((erym) erylVar.instance).c.size() > 0) {
                    if (bfkfVar2.isFirst()) {
                        eryh eryhVar = (eryh) eryi.a.createBuilder();
                        eryhVar.copyOnWrite();
                        ((eryi) eryhVar.instance).b = "EMPTY";
                        eryhVar.copyOnWrite();
                        ((eryi) eryhVar.instance).c = Long.MAX_VALUE;
                        erylVar.copyOnWrite();
                        erym erymVar = (erym) erylVar.instance;
                        eryi eryiVar = (eryi) eryhVar.build();
                        eryiVar.getClass();
                        erymVar.e = eryiVar;
                        erymVar.b |= 1;
                    } else {
                        bcrs bcrsVar2 = bcrsVar;
                        eryh eryhVar2 = (eryh) eryi.a.createBuilder();
                        String a3 = bcrsVar2.Q().a();
                        eryhVar2.copyOnWrite();
                        eryi eryiVar2 = (eryi) eryhVar2.instance;
                        a3.getClass();
                        eryiVar2.b = a3;
                        long N = bcrsVar2.N();
                        eryhVar2.copyOnWrite();
                        ((eryi) eryhVar2.instance).c = N;
                        erylVar.copyOnWrite();
                        erym erymVar2 = (erym) erylVar.instance;
                        eryi eryiVar3 = (eryi) eryhVar2.build();
                        eryiVar3.getClass();
                        erymVar2.e = eryiVar3;
                        erymVar2.b |= 1;
                        String str = String.valueOf(bcrsVar2.Q()) + "\u2063" + bcrsVar2.N();
                        erylVar.copyOnWrite();
                        ((erym) erylVar.instance).d = str;
                    }
                }
                return (erym) erylVar.build();
            }
        }, this.d)).a;
    }
}
