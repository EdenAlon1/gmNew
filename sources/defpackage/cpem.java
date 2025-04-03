package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.Locale;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpem implements cpei {
    public final Context b;
    public final cnmx c;
    private final ciqn e;
    private final cins f;
    private static final entd d = entd.c("BugleNotifications");
    public static final cfva a = cfvl.r(376869573, "enable_report_on_schema_upgrade_failure");

    public cpem(Context context, ciqn ciqnVar, cins cinsVar, cnmx cnmxVar) {
        this.b = context;
        this.e = ciqnVar;
        this.f = cinsVar;
        this.c = cnmxVar;
    }

    @Override // defpackage.cpei
    public final void a() {
        if (this.f.K()) {
            this.f.I(this.e.a(new ciql() { // from class: cpek
                @Override // defpackage.ciql
                public final Notification a(String str) {
                    Context context = cpem.this.b;
                    Resources resources = context.getResources();
                    kml kmlVar = new kml(context, str);
                    kmlVar.i(resources.getString(R.string.exhausted_storage_space_notification_and_dialog_title));
                    kmlVar.w(resources.getString(R.string.exhausted_storage_space_notification_body));
                    kmlVar.r(R.drawable.ic_warning_light);
                    kmlVar.l = 3;
                    kmlVar.o(false);
                    kmlVar.g(false);
                    kme kmeVar = new kme(kmlVar);
                    kmeVar.e(resources.getString(R.string.exhausted_storage_space_notification_body));
                    kmlVar.u(kmeVar);
                    return kmlVar.a();
                }
            }, cinj.EXHAUSTED_STORAGE_SPACE));
        } else {
            ((ensz) d.n().h("com/google/android/apps/messaging/shared/storage/notification/ExhaustedStorageSpaceNotifierImpl", "postExhaustedStorageSpaceNotification", 67, "ExhaustedStorageSpaceNotifierImpl.java")).q("Notifications disabled, won't notify");
        }
    }

    @Override // defpackage.cpei
    public final boolean b(final long j) {
        if (!c()) {
            return false;
        }
        this.f.I(this.e.a(new ciql() { // from class: cpel
            @Override // defpackage.ciql
            public final Notification a(String str) {
                cpem cpemVar = cpem.this;
                kml kmlVar = new kml(cpemVar.b, str);
                kmlVar.r(R.drawable.notification_icon);
                kmlVar.o(true);
                kmlVar.i("Schema Upgrade Failure");
                kmlVar.h(String.format(Locale.US, "Exception upgrading the schema from version %d.  Use Clear Storage to proceed.", Long.valueOf(j)));
                klz klzVar = new klz(R.drawable.ic_warning_light, "Report", cpemVar.c.d(ephv.GENERIC_ISSUE));
                klzVar.d = true;
                kmlVar.e(klzVar.a());
                kmlVar.l = 1;
                return kmlVar.a();
            }
        }, cinj.DATABASE_UPGRADE_FAILURE));
        return true;
    }

    @Override // defpackage.cpei
    public final boolean c() {
        return ((Boolean) a.e()).booleanValue() && !DesugarArrays.stream(new eovw[]{eovw.ROBOLECTRIC_BUILD, eovw.ENG_BUILD, eovw.FISH_FOOD_BUILD, eovw.ARTIK_BUILD, eovw.ARIGATO_BUILD, eovw.DOMO_BUILD}).noneMatch(new Predicate() { // from class: cpej
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                eovw eovwVar = (eovw) obj;
                cfva cfvaVar = cpem.a;
                return eovwVar == csjc.a;
            }
        }) && this.f.K();
    }
}
