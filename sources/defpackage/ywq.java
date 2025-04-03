package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywq implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener, abqq, dtfu {
    public static final /* synthetic */ int l = 0;
    private static final enru m = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController");
    public final ffsk a;
    public final Context b;
    public final ejmh c;
    public final ddzb d;
    public final arer e;
    public final ffbr f;
    public final ffbr g;
    public final Optional h;
    public final cwrk i;
    public final fgdj j;
    public int k;
    private final arby n;
    private final ffsk o;
    private final arca p;
    private final fgcq q;
    private final ffbr r;
    private final aldm s;
    private final aldr t;
    private final fgcm u;
    private final fgcm v;
    private final fgcm w;
    private final ffbz x;
    private final ffbz y;

    public ywq(arby arbyVar, ffsk ffskVar, ffsk ffskVar2, Context context, ejmh ejmhVar, cqoh cqohVar, arca arcaVar, ddzb ddzbVar, fgcq fgcqVar, dqlx dqlxVar, ffbr ffbrVar, cteg ctegVar, arer arerVar, @aret ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, aldm aldmVar, aldr aldrVar, Optional optional, ffbr ffbrVar5, cwrk cwrkVar) {
        arbyVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        context.getClass();
        ejmhVar.getClass();
        cqohVar.getClass();
        arcaVar.getClass();
        ddzbVar.getClass();
        fgcqVar.getClass();
        dqlxVar.getClass();
        ctegVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        aldmVar.getClass();
        aldrVar.getClass();
        cwrkVar.getClass();
        this.n = arbyVar;
        this.o = ffskVar;
        this.a = ffskVar2;
        this.b = context;
        this.c = ejmhVar;
        this.p = arcaVar;
        this.d = ddzbVar;
        this.q = fgcqVar;
        this.r = ffbrVar;
        this.e = arerVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.s = aldmVar;
        this.t = aldrVar;
        this.h = optional;
        this.i = cwrkVar;
        this.u = fgdm.a(dtja.b);
        this.v = fgdm.a(null);
        this.w = fgdm.a(null);
        this.k = 1;
        this.x = ffca.a(new ffix() { // from class: ywe
            @Override // defpackage.ffix
            public final Object invoke() {
                return ((dthi) ywq.this.g.b()).b;
            }
        });
        ywp ywpVar = new ywp(new ywm(fgcqVar));
        int i = fgcz.a;
        this.j = fgbn.b(ywpVar, ffskVar2, fgcy.a, false);
        this.y = ffca.a(new ffix() { // from class: ywf
            @Override // defpackage.ffix
            public final Object invoke() {
                ywq ywqVar = ywq.this;
                dtiz dtizVar = ((dthi) ywqVar.g.b()).d;
                ywh ywhVar = new ywh(dtizVar, ywqVar);
                eygr eygrVar = ((ardl) ardj.h.e()).b;
                eygrVar.getClass();
                return new dtiz(dtizVar.a, dtizVar.b, ywhVar, dtizVar.d, dtizVar.e, dtizVar.f, dtizVar.g, new dtil(ywqVar.j, eygrVar, true, ywqVar.i.a), dtizVar.m, true, ywqVar.e.a() ? ywqVar.h : Optional.empty(), ((asof) ywqVar.f.b()).a(), true);
            }
        });
    }

    private final eqln j() {
        final ffji ffjiVar = new ffji() { // from class: ywc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int i = ywq.l;
                return ((Boolean) ((dpdv) obj).b.c()).booleanValue() ? eqln.NOISE_CANCELLATION_STATE_ENABLED : eqln.NOISE_CANCELLATION_STATE_DISABLED;
            }
        };
        return (eqln) this.h.map(new Function() { // from class: ywd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = ywq.l;
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(eqln.NOISE_CANCELLATION_STATE_UNKNOWN);
    }

    private final Duration k() {
        return a().b();
    }

    public final dtgp a() {
        return (dtgp) this.x.a();
    }

    public final dtiz b() {
        return (dtiz) this.y.a();
    }

    public final void c() {
        if (i()) {
            ((xie) this.r.b()).c(null);
        }
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        axol.k(this.o, null, new ywg(this, null), 3);
    }

    @Override // defpackage.dtfu
    public final void d(Duration duration) {
        this.s.b(duration.toSeconds(), this.k, j());
    }

    @Override // defpackage.dtfu
    public final void e(Exception exc) {
        exc.getClass();
        this.t.b(this.k);
    }

    @Override // defpackage.dtfu
    public final void f(Duration duration) {
        this.s.c(duration.toSeconds(), this.k, j());
    }

    public final void g() {
        ((xie) this.r.b()).c(xhy.a);
    }

    public final void h() {
        this.p.a();
        if (this.n.d()) {
            f(k());
            List d = this.n.c.a.d();
            ArrayList arrayList = new ArrayList(ffdx.n(d, 10));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((dteo) it.next()).a));
            }
            Uri b = this.n.b();
            if (b != null) {
                fgcm fgcmVar = this.w;
                drjx drjxVar = ((Boolean) ardj.a.e()).booleanValue() ? drjk.a : drji.a;
                String uri = b.toString();
                uri.getClass();
                Instant now = Instant.now();
                now.getClass();
                fgcmVar.f(new drng(drjxVar, uri, null, null, 0L, now, dtem.a, k(), null, 268));
                this.u.f(dtjb.c);
            }
        }
    }

    public final boolean i() {
        dtbv a = ((xie) this.r.b()).a();
        dtbr dtbrVar = a instanceof dtbr ? (dtbr) a : null;
        return (dtbrVar != null ? dtbrVar.a.a : null) == dszr.g;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        ensk i3 = m.i();
        i3.Y(ente.a, "BugleComposeRow2");
        ((enrr) i3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onError", 279, "VoiceRecordingController.kt")).u("Error occurred during audio recording what=%s, extra=%s", i, i2);
        e(new Exception(a.r(i2, i, "MediaRecorder error what=", ", extra=")));
        this.p.a();
        if (this.n.d()) {
            d(k());
            Uri b = this.n.b();
            if (b != null) {
                axol.k(this.o, null, new ywi(this, b, null), 3);
            }
        }
        this.u.f(dtja.b);
        this.v.f(null);
        this.w.f(null);
        this.v.f(Integer.valueOf(R.string.audio_recording_error));
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        if (i == 800) {
            ensk h = m.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onInfo", 288, "VoiceRecordingController.kt")).q("Max duration reached while recording audio");
            this.d.k(R.string.audio_recorder_time_limit_reached_text);
            h();
            return;
        }
        if (i != 801) {
            return;
        }
        ensk h2 = m.h();
        h2.Y(ente.a, "BugleComposeRow2");
        ((enrr) h2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onInfo", 293, "VoiceRecordingController.kt")).q("Max size reached while recording audio");
        h();
    }
}
