package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrs implements dvqv {
    public static final entd a = entd.c("GnpSdk");
    private static final dvmb d = new dvmb();
    public final dvcp b;
    public final dvpl c;
    private final Context e;
    private final String f;
    private final eafv g;
    private final ffbr h;
    private final Set i;
    private final errl j;
    private final dvcb k;

    public dvrs(Context context, String str, eafv eafvVar, dvcp dvcpVar, ffbr ffbrVar, Set set, dvpl dvplVar, errl errlVar, dvcb dvcbVar) {
        this.e = context;
        this.f = str;
        this.g = eafvVar;
        this.b = dvcpVar;
        this.h = ffbrVar;
        this.i = set;
        this.c = dvplVar;
        this.j = errlVar;
        this.k = dvcbVar;
    }

    private final Intent f(evvx evvxVar) {
        Intent intent;
        String str = evvxVar.e;
        String str2 = evvxVar.d;
        String str3 = !evvxVar.c.isEmpty() ? evvxVar.c : TextUtils.isEmpty(str2) ? this.f : "";
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            intent = this.e.getPackageManager().getLaunchIntentForPackage(str3);
            if (intent == null) {
                return null;
            }
        } else {
            Intent intent2 = new Intent();
            if (!TextUtils.isEmpty(str)) {
                intent2.setClassName(str3, str);
            } else if (!TextUtils.isEmpty(str3)) {
                intent2.setPackage(str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent2.setAction(str2);
            }
            intent = intent2;
        }
        String str4 = evvxVar.f;
        if (!TextUtils.isEmpty(str4)) {
            intent.setData(Uri.parse(str4));
        }
        intent.addFlags(evvxVar.i);
        return intent;
    }

    @Override // defpackage.dvqv
    public final /* synthetic */ evvt a(evxi evxiVar) {
        evxg b = evxg.b(evxiVar.e);
        if (b == null) {
            b = evxg.ACTION_UNKNOWN;
        }
        int ordinal = b.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? evvt.UNKNOWN_ACTION : evvt.ACKNOWLEDGE_RESPONSE : evvt.DISMISSED : evvt.NEGATIVE_RESPONSE : evvt.POSITIVE_RESPONSE;
    }

    @Override // defpackage.dvqv
    public final void b(Activity activity, evvw evvwVar, Intent intent) {
        if (intent == null) {
            ((ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", 174, "UserActionUtilImpl.java")).q("Intent could not be loaded, not launching.");
            return;
        }
        int ordinal = evvwVar.ordinal();
        if (ordinal == 1) {
            try {
                activity.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", (char) 182, "UserActionUtilImpl.java")).q("Did not found activity to start");
                return;
            }
        }
        if (ordinal == 2) {
            activity.startService(intent);
            return;
        }
        if (ordinal == 3) {
            activity.sendBroadcast(intent);
            return;
        }
        if (ordinal != 4) {
            ((ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", 199, "UserActionUtilImpl.java")).t("IntentType %s not yet supported", evvwVar.name());
            return;
        }
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e2) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e2)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "launchIntent", (char) 195, "UserActionUtilImpl.java")).q("Did not found activity to start");
        }
    }

    @Override // defpackage.dvqv
    public final void c(final dvdp dvdpVar, final evvt evvtVar) {
        evts c = dvdpVar.c();
        evtl evtlVar = (evtl) evto.a.createBuilder();
        evub evubVar = c.c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        evtlVar.copyOnWrite();
        evto evtoVar = (evto) evtlVar.instance;
        evubVar.getClass();
        evtoVar.c = evubVar;
        evtoVar.b |= 1;
        evtlVar.copyOnWrite();
        ((evto) evtlVar.instance).d = evvtVar.a();
        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(dvdpVar.a());
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).b = seconds;
        evtlVar.copyOnWrite();
        evto evtoVar2 = (evto) evtlVar.instance;
        eyja eyjaVar = (eyja) eyizVar.build();
        eyjaVar.getClass();
        evtoVar2.e = eyjaVar;
        evtoVar2.b |= 2;
        if (dvdpVar.d() != null) {
            evtn evtnVar = (evtn) d.fP(dvdpVar.d());
            evtlVar.copyOnWrite();
            evto evtoVar3 = (evto) evtlVar.instance;
            evtnVar.getClass();
            evtoVar3.f = evtnVar;
            evtoVar3.b |= 4;
        }
        evto evtoVar4 = (evto) evtlVar.build();
        dvmt dvmtVar = (dvmt) this.g.a(dvdpVar.e());
        evub evubVar2 = c.c;
        if (evubVar2 == null) {
            evubVar2 = evub.a;
        }
        ListenableFuture d2 = dvmtVar.d(dvmu.b(evubVar2), evtoVar4);
        dvcb dvcbVar = this.k;
        evtz evtzVar = c.j;
        if (evtzVar == null) {
            evtzVar = evtz.a;
        }
        dvcbVar.a(evtoVar4, evtzVar);
        eakf.a(d2, new emxs() { // from class: dvrq
            @Override // defpackage.emxs
            public final void a(Object obj) {
                dvrs dvrsVar = dvrs.this;
                dvdp dvdpVar2 = dvdpVar;
                int ordinal = evvtVar.ordinal();
                if (ordinal == 1) {
                    dvrsVar.b.n(dvdpVar2);
                    return;
                }
                if (ordinal == 2) {
                    dvrsVar.b.m(dvdpVar2, eycq.ACTION_POSITIVE);
                    return;
                }
                if (ordinal == 3) {
                    dvrsVar.b.m(dvdpVar2, eycq.ACTION_NEGATIVE);
                } else if (ordinal != 6) {
                    dvrsVar.b.m(dvdpVar2, eycq.ACTION_UNKNOWN);
                } else {
                    dvrsVar.b.m(dvdpVar2, eycq.ACTION_ACKNOWLEDGE);
                }
            }
        }, new emxs() { // from class: dvrr
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) ((ensz) ((ensz) dvrs.a.j()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/UserActionUtilImpl", "persistUserChoice", 156, "UserActionUtilImpl.java")).q("Failed to persist dialog button click.");
            }
        });
        erqt.b(d2).b(eldl.c(new erog() { // from class: dvro
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return dvrs.this.c.a(13);
            }
        }), this.j);
        dvuy dvuyVar = (dvuy) this.h.b();
        if (dvuyVar != null) {
            dvun dvunVar = new dvun();
            evzd evzdVar = c.f;
            if (evzdVar == null) {
                evzdVar = evzd.a;
            }
            dvunVar.c = dvdr.b(evzdVar);
            dvunVar.a();
            int ordinal = evvtVar.ordinal();
            dvuyVar.d(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 6 ? dvur.ACTION_UNKNOWN : dvur.ACTION_ACKNOWLEDGE : dvur.ACTION_NEGATIVE : dvur.ACTION_POSITIVE : dvur.ACTION_DISMISS);
        }
    }

    @Override // defpackage.dvqv
    public final boolean d(Context context, evvx evvxVar) {
        evvw b = evvw.b(evvxVar.g);
        if (b == null) {
            b = evvw.UNKNOWN;
        }
        if (!evvw.ACTIVITY.equals(b) && !evvw.ACTIVITY_WITH_RESULT.equals(b)) {
            return true;
        }
        Intent f = f(evvxVar);
        return (f == null || f.resolveActivityInfo(context.getPackageManager(), f.getFlags()) == null) ? false : true;
    }

    @Override // defpackage.dvqv
    public final ListenableFuture e(evvx evvxVar, evxi evxiVar) {
        evyl evylVar;
        final Intent f = f(evvxVar);
        if (f == null) {
            return erqt.i(null);
        }
        for (evyn evynVar : evvxVar.h) {
            int i = evynVar.c;
            int a2 = evym.a(i);
            if (a2 == 0) {
                throw null;
            }
            int i2 = a2 - 1;
            if (i2 == 0) {
                f.putExtra(evynVar.e, i == 2 ? (String) evynVar.d : "");
            } else if (i2 == 1) {
                f.putExtra(evynVar.e, i == 4 ? ((Integer) evynVar.d).intValue() : 0);
            } else if (i2 == 2) {
                f.putExtra(evynVar.e, i == 5 ? ((Boolean) evynVar.d).booleanValue() : false);
            } else if (i2 == 3) {
                if (i == 3) {
                    evylVar = evyl.b(((Integer) evynVar.d).intValue());
                    if (evylVar == null) {
                        evylVar = evyl.CLIENT_VALUE_UNKNOWN;
                    }
                } else {
                    evylVar = evyl.CLIENT_VALUE_UNKNOWN;
                }
                evylVar.ordinal();
            }
        }
        ArrayList arrayList = new ArrayList();
        Bundle extras = f.getExtras();
        evxg b = evxg.b(evxiVar.e);
        if (b == null) {
            b = evxg.ACTION_UNKNOWN;
        }
        dvur a3 = dvdr.a(b);
        if (a3 == null) {
            throw new NullPointerException("Null actionType");
        }
        dvup dvupVar = new dvup(extras, a3);
        enqu listIterator = ((enpx) this.i).listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(dvvr.b(dvupVar));
        }
        return erny.f(erqt.e(arrayList), new emwl() { // from class: dvrp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = dvrs.a;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Intent intent = f;
                    if (!it.hasNext()) {
                        return intent;
                    }
                    Bundle bundle = (Bundle) it.next();
                    if (bundle != null) {
                        intent.putExtras(bundle);
                    }
                }
            }
        }, erpp.a);
    }
}
