package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baam {
    public static final cskc a = cskc.g("Bugle", "VerifiedSmsEntityManager");
    public final dtuu b;
    private final crji c;
    private final ffbr d;

    public baam(crji crjiVar, ffbr ffbrVar, dtuu dtuuVar) {
        this.c = crjiVar;
        this.d = ffbrVar;
        this.b = dtuuVar;
    }

    public static final byzi c(String str) {
        csjb a2 = a.a();
        a2.I("requesting participant verified sms status");
        a2.f(str);
        a2.r();
        return (byzi) ParticipantsTable.k(str, new Function() { // from class: baah
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).D();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: baai
            @Override // java.util.function.Supplier
            public final Object get() {
                return byzi.VERIFICATION_NA;
            }
        });
    }

    public final bpyj a(final String str) {
        Object apply;
        csjb a2 = a.a();
        a2.I("Fetching sender and associated brand");
        a2.M("senderId", str);
        a2.r();
        String[] strArr = bpzi.a;
        bpzf bpzfVar = new bpzf(bpzi.a);
        bpzfVar.z("getSenderWithBrandBySenderId");
        apply = new Function() { // from class: baaj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpzh bpzhVar = (bpzh) obj;
                bpzhVar.b(str);
                return bpzhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bpzh());
        bpzfVar.k(new bpzg((bpzh) apply));
        return (bpyj) ((bpzd) bpzfVar.b().o()).cS();
    }

    public final void b(final String str) {
        cskc cskcVar = a;
        csjb c = cskcVar.c();
        c.I("marking participant as unverified");
        c.f(str);
        c.r();
        bvvr f = ParticipantsTable.f();
        f.ap("updateParticipantForUnverifiedSms");
        f.V(new Function() { // from class: baak
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.k(str);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f.M(this.c.c(null, byzi.VERIFICATION_UNVERIFIED));
        f.u();
        f.w();
        f.B(byzi.VERIFICATION_UNVERIFIED);
        if (f.b().e() > 0) {
            csjb c2 = cskcVar.c();
            c2.I("participant was updated. Refreshing conversations");
            c2.r();
            ((bczy) this.d.b()).R(str);
        }
    }
}
