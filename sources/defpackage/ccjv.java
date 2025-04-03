package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccjv {
    public static final emyl a = cfvl.x(174785576, "cms_initial_backup_skip_dlq_entries");
    public static final cskc b = cskc.g("BugleCms", "CmsInitialBackupScheduler");
    public final ccdo c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    private final eisx k;
    private final cqoh l;

    public ccjv(eisx eisxVar, ccdo ccdoVar, cqoh cqohVar, int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.k = eisxVar;
        this.c = ccdoVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.l = cqohVar;
    }

    private static final bqkm f(final int i) {
        Object apply;
        bqkn a2 = bqkv.a();
        a2.z("getDeadLetterBugleIdsQueryForTable");
        apply = new Function() { // from class: ccjq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                emyl emylVar = ccjv.a;
                return ((bqjt) obj).g;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bqkv.c);
        bqju[] bqjuVarArr = {(bqju) apply};
        int intValue = bqkv.c().intValue();
        if (((Integer) bqkv.b.getOrDefault(bqjuVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        a2.m(bqjuVarArr);
        a2.c(new Function() { // from class: ccjr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqku bqkuVar = (bqku) obj;
                emyl emylVar = ccjv.a;
                bqkuVar.c(i);
                bqkuVar.b(bqkw.BACKUP_CREATE, bqkw.INITIAL_BACKUP_CREATE, bqkw.INCREMENTAL_BACKUP_CREATE);
                return bqkuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a2.b();
    }

    public final bqwr a() {
        Object apply;
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.i(1, 3);
        String[] strArr = bqws.a;
        bqwr bqwrVar = new bqwr();
        Function[] functionArr = {new Function() { // from class: ccjo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqwr bqwrVar2 = (bqwr) obj;
                ccjv ccjvVar = ccjv.this;
                bqwrVar2.e(ccjvVar.e);
                bqwrVar2.d(ccjvVar.f);
                return bqwrVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: ccjp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqwr bqwrVar2 = (bqwr) obj;
                bqwrVar2.aq(new dtwe("cms.key_type", 8, Integer.valueOf(ccjv.this.e)));
                return bqwrVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        bqwr[] bqwrVarArr = new bqwr[2];
        for (int i2 = 0; i2 < 2; i2++) {
            apply = functionArr[i2].apply(new bqwr());
            bqwrVarArr[i2] = (bqwr) apply;
        }
        bqwrVar.ar(bqwrVarArr);
        bqwrVar.b();
        bqwrVar.aq(new dtrw("cms.key_type", 3, bqwr.at(engrVar.g()), true));
        return bqwrVar;
    }

    public final bsol b() {
        String[] strArr = bsom.a;
        bsol bsolVar = new bsol();
        bsolVar.u(this.h);
        bsolVar.g();
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            bsolVar.v(f(2));
        }
        return bsolVar;
    }

    public final buxz c() {
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.x(this.i);
        buxzVar.U(this.j);
        buxzVar.h();
        buxzVar.M(2);
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            buxzVar.y(f(1));
        }
        return buxzVar;
    }

    public final bvvw d() {
        String[] strArr = ParticipantsTable.a;
        bvvw bvvwVar = new bvvw();
        bvvwVar.n(this.g);
        bvvw bvvwVar2 = new bvvw();
        bvvwVar2.w(-1);
        bvvw bvvwVar3 = new bvvw();
        bvvwVar3.w(-2);
        bvvwVar.ar(bvvwVar2, bvvwVar3);
        bvvwVar.g();
        if (((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            bvvwVar.aq(new dtru("participants._id", 4, f(3)));
        }
        return bvvwVar;
    }

    public final void e(int i, String str, int i2) {
        cccd cccdVar = (cccd) ccce.a.createBuilder();
        int a2 = this.k.a();
        cccdVar.copyOnWrite();
        ccce ccceVar = (ccce) cccdVar.instance;
        ccceVar.b |= 1;
        ccceVar.c = a2;
        cccdVar.copyOnWrite();
        ccce ccceVar2 = (ccce) cccdVar.instance;
        ccceVar2.b |= 16;
        ccceVar2.g = true;
        cccdVar.copyOnWrite();
        ccce ccceVar3 = (ccce) cccdVar.instance;
        ccceVar3.b |= 2;
        ccceVar3.d = i;
        cccdVar.copyOnWrite();
        ccce ccceVar4 = (ccce) cccdVar.instance;
        str.getClass();
        ccceVar4.b |= 4;
        ccceVar4.e = str;
        cccdVar.copyOnWrite();
        ccce ccceVar5 = (ccce) cccdVar.instance;
        ccceVar5.b |= 8;
        ccceVar5.f = i2;
        eyja d = eykm.d(this.l.f().toEpochMilli());
        cccdVar.copyOnWrite();
        ccce ccceVar6 = (ccce) cccdVar.instance;
        d.getClass();
        ccceVar6.i = d;
        ccceVar6.b |= 64;
        this.c.c((ccce) cccdVar.build());
    }
}
