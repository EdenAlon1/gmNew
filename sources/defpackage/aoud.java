package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoud implements apvk {
    public final BugleConversationId a;
    public final aotl b;
    public final aozw c;
    private final boolean e;
    public final enru d = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries");
    private final aotx f = new aotx();

    public aoud(BugleConversationId bugleConversationId, aotl aotlVar, boolean z) {
        this.a = bugleConversationId;
        this.b = aotlVar;
        this.e = z;
        this.c = new aozw(z);
    }

    private final buxm e(final aott aottVar) {
        buxm f = f();
        buxo d = MessagesTable.d();
        d.z("countItemsBeforeKeyQuery");
        d.u();
        d.n(new dtzr("COUNT(*)"), "cpt");
        d.h(new Function() { // from class: aotv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                aozw.b(buxzVar, aoud.this.a);
                aozw.d(buxzVar, aottVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxm b = this.c.a(d).b();
        buxo d2 = MessagesTable.d();
        d2.z("+countItemsBeforeKeyAndTotalQuery");
        d2.u();
        d2.n(g(f), "total");
        d2.n(g(b), "subtotal");
        d2.x(1);
        return d2.b();
    }

    private final buxm f() {
        buxo d = MessagesTable.d();
        d.z("totalCountQuery");
        d.u();
        d.n(new dtzr("COUNT(*)"), "cpt");
        d.h(new Function() { // from class: aotu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.getClass();
                aozw.b(buxzVar, aoud.this.a);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return this.c.a(d).b();
    }

    private final dtzj g(buxm buxmVar) {
        return this.e ? new dtzq("SELECT cpt FROM $V", new Object[]{buxmVar}) : buxmVar;
    }

    @Override // defpackage.apvk
    public final apvj a(alxw alxwVar) {
        if (!(alxwVar instanceof aott)) {
            throw new IllegalStateException("Check failed.");
        }
        final aott aottVar = (aott) alxwVar;
        buxm f = f();
        aozw aozwVar = this.c;
        buxo d = MessagesTable.d();
        d.z("countItemsAfterKeyQuery");
        d.u();
        d.n(new dtzr("COUNT(*)"), "cpt");
        d.h(new Function() { // from class: aotw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                aozw.b(buxzVar, aoud.this.a);
                aozw.c(buxzVar, aottVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxm b = aozwVar.a(d).b();
        buxo d2 = MessagesTable.d();
        d2.z("+countItemsAfterKeyAndTotalQuery");
        d2.u();
        d2.n(g(f), "total");
        d2.n(g(b), "subtotal");
        d2.x(1);
        dtsu o = d2.b().o();
        try {
            buuo buuoVar = (buuo) o;
            if (!buuoVar.moveToNext()) {
                aotx aotxVar = this.f;
                ffig.a(o, null);
                return aotxVar;
            }
            String dd = buuoVar.dd("total");
            dd.getClass();
            long parseLong = Long.parseLong(dd);
            String dd2 = buuoVar.dd("subtotal");
            dd2.getClass();
            aoty aotyVar = new aoty(parseLong, Long.parseLong(dd2), this);
            ffig.a(o, null);
            return aotyVar;
        } finally {
        }
    }

    @Override // defpackage.apvk
    public final apvj b(alxw alxwVar) {
        if (!(alxwVar instanceof aott)) {
            throw new IllegalStateException("Check failed.");
        }
        dtsu o = e((aott) alxwVar).o();
        try {
            buuo buuoVar = (buuo) o;
            if (!buuoVar.moveToNext()) {
                aotx aotxVar = this.f;
                ffig.a(o, null);
                return aotxVar;
            }
            String dd = buuoVar.dd("total");
            dd.getClass();
            long parseLong = Long.parseLong(dd);
            String dd2 = buuoVar.dd("subtotal");
            dd2.getClass();
            aoua aouaVar = new aoua(alxwVar, Long.parseLong(dd2), this, parseLong);
            ffig.a(o, null);
            return aouaVar;
        } finally {
        }
    }

    @Override // defpackage.apvk
    public final apvj c(int i) {
        dtsu o = f().o();
        try {
            buuo buuoVar = (buuo) o;
            if (!buuoVar.moveToNext()) {
                aotx aotxVar = this.f;
                ffig.a(o, null);
                return aotxVar;
            }
            String dd = buuoVar.dd("cpt");
            dd.getClass();
            aoub aoubVar = new aoub(Long.parseLong(dd), i, this);
            ffig.a(o, null);
            return aoubVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(o, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.apvk
    public final apvj d(alxw alxwVar) {
        if (!(alxwVar instanceof aott)) {
            throw new IllegalStateException("Check failed.");
        }
        dtsu o = e((aott) alxwVar).o();
        try {
            buuo buuoVar = (buuo) o;
            if (!buuoVar.moveToNext()) {
                aotx aotxVar = this.f;
                ffig.a(o, null);
                return aotxVar;
            }
            String dd = buuoVar.dd("total");
            dd.getClass();
            long parseLong = Long.parseLong(dd);
            String dd2 = buuoVar.dd("subtotal");
            dd2.getClass();
            aouc aoucVar = new aouc(Long.parseLong(dd2), this, parseLong);
            ffig.a(o, null);
            return aoucVar;
        } finally {
        }
    }
}
