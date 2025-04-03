package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjry extends ffhv implements ffjm {
    final /* synthetic */ cjrz a;
    final /* synthetic */ WorkerParameters b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjry(cjrz cjrzVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cjrzVar;
        this.b = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjry) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!((Boolean) this.a.c.b()).booleanValue()) {
            ensk h = cjrz.a.h();
            h.Y(ente.a, "BugleProfiles");
            ((enrr) h.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 55, "ProfilesCleanupWorker.kt")).q("Cleanup worker disabled, canceling work");
            return new ppn();
        }
        if (this.b.b.h("profile_cleanup_is_one_time_extra")) {
            ensk h2 = cjrz.a.h();
            h2.Y(ente.a, "BugleProfiles");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 60, "ProfilesCleanupWorker.kt")).q("Running one off cleanup work");
        } else if (((Boolean) this.a.b.b()).booleanValue()) {
            ensk h3 = cjrz.a.h();
            h3.Y(ente.a, "BugleProfiles");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 65, "ProfilesCleanupWorker.kt")).q("People API client enabled, canceling periodic work");
            return new ppn();
        }
        ensk h4 = cjrz.a.h();
        h4.Y(ente.a, "BugleProfiles");
        ((enrr) h4.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 70, "ProfilesCleanupWorker.kt")).q("Profiles cleanup worker started");
        cjrz cjrzVar = this.a;
        if (((aulh) cjrzVar.f.b()).a()) {
            String[] strArr = bxve.a;
            bxuu bxuuVar = new bxuu();
            bxuuVar.f("ProfilesCleanupWorker#deleteSelfProfiles");
            bxuuVar.e();
            int d = bxuuVar.d();
            ensk h5 = cjrz.a.h();
            h5.Y(ente.a, "BugleProfiles");
            ((enrr) h5.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 82, "ProfilesCleanupWorker.kt")).r("Cleared %s self profile table rows", d);
        }
        bwon a = ProfilesTable.a();
        a.z("ProfilesCleanupWorker#getParticipants");
        a.r();
        bwnm bwnmVar = (bwnm) a.b().p(ProfilesTable.c.b);
        try {
            engw c = bwnmVar.c();
            bwnmVar.close();
            c.getClass();
            final ArrayList arrayList = new ArrayList(ffdx.n(c, 10));
            enqv it = c.iterator();
            while (it.hasNext()) {
                arrayList.add(((Long) it.next()).toString());
            }
            bwoj bwojVar = new bwoj();
            bwojVar.f("ProfilesCleanupWorker#deleteProfiles");
            bwojVar.e();
            int d2 = bwojVar.d();
            ensk h6 = cjrz.a.h();
            h6.Y(ente.a, "BugleProfiles");
            enrr enrrVar = (enrr) h6;
            enrrVar.Y(cjvb.b, Integer.valueOf(d2));
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 100, "ProfilesCleanupWorker.kt")).q("Cleared profile table rows");
            if (arrayList.isEmpty()) {
                ensk h7 = cjrz.a.h();
                h7.Y(ente.a, "BugleProfiles");
                ((enrr) h7.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 103, "ProfilesCleanupWorker.kt")).q("No profiles data to cleanup, not updating");
                return new ppp();
            }
            bvvr f = ParticipantsTable.f();
            f.ap("ProfilesCleanupWorker#clearPhotos");
            f.V(new Function() { // from class: cjrx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bvvw bvvwVar = (bvvw) obj2;
                    bvvwVar.m(arrayList);
                    bvvwVar.u();
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.M(null);
            f.J(cjwi.PROFILE_UNSPECIFIED_SOURCE);
            int e = f.b().e();
            ensk h8 = cjrz.a.h();
            h8.Y(ente.a, "BugleProfiles");
            enrr enrrVar2 = (enrr) h8;
            enrrVar2.Y(cjvb.a, Integer.valueOf(e));
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 119, "ProfilesCleanupWorker.kt")).q("Cleared photos from participants table");
            ensk h9 = cjrz.a.h();
            h9.Y(ente.a, "BugleProfiles");
            ((enrr) h9.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 121, "ProfilesCleanupWorker.kt")).q("Refreshing contacts");
            ((baiv) cjrzVar.d.b()).a().y(301, 0L);
            ensk h10 = cjrz.a.h();
            h10.Y(ente.a, "BugleProfiles");
            ((enrr) h10.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 127, "ProfilesCleanupWorker.kt")).q("Updated conversations for updated participants");
            ((bczy) cjrzVar.e.b()).S(new ArrayList(arrayList));
            ensk h11 = cjrz.a.h();
            h11.Y(ente.a, "BugleProfiles");
            ((enrr) h11.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 132, "ProfilesCleanupWorker.kt")).q("Profiles cleanup worker finished");
            return new ppp();
        } catch (Throwable th) {
            try {
                bwnmVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjry(this.a, this.b, ffguVar);
    }
}
