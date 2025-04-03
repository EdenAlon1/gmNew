package defpackage;

import android.media.MediaRecorder;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import j$.time.Duration;
import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uop implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener, dtik {
    private static final enru g = enru.c("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController");
    public final ejmh a;
    public final fgdj b;
    public final ffxx c;
    public final fgdj d;
    public final fgdj e;
    public final fgdj f;
    private final arby h;
    private final ffsk i;
    private final cqoh j;
    private final bcwz k;
    private final arca l;
    private final ddzb m;
    private final aldm n;
    private final aldr o;
    private final ugg p;
    private final Supplier q;
    private Instant r;
    private final fgcm s;
    private final fgcm t;
    private final fgcm u;

    public uop(arby arbyVar, ffsk ffskVar, ejmh ejmhVar, cqoh cqohVar, bcwz bcwzVar, arca arcaVar, ddzb ddzbVar, aldm aldmVar, aldr aldrVar, ugg uggVar, Supplier supplier) {
        this.h = arbyVar;
        this.i = ffskVar;
        this.a = ejmhVar;
        this.j = cqohVar;
        this.k = bcwzVar;
        this.l = arcaVar;
        this.m = ddzbVar;
        this.n = aldmVar;
        this.o = aldrVar;
        this.p = uggVar;
        this.q = supplier;
        fgcm a = fgdm.a(dtja.b);
        this.s = a;
        fgcm a2 = fgdm.a(null);
        this.t = a2;
        fgcm a3 = fgdm.a(null);
        this.u = a3;
        this.b = new fgco(a);
        this.c = arbyVar.c.a;
        this.d = arcaVar.d;
        this.e = new fgco(a2);
        this.f = new fgco(a3);
    }

    private final Duration e() {
        return Duration.between(this.r, this.j.f());
    }

    private final void f() {
        this.l.a();
        if (this.h.d()) {
            this.n.b(e().toSeconds(), 6, eqln.NOISE_CANCELLATION_STATE_UNKNOWN);
            Uri b = this.h.b();
            if (b != null) {
                axol.k(this.i, null, new uoo(this, b, null), 3);
            }
        }
        i();
    }

    private final void g() {
        Object obj;
        k();
        drng drngVar = (drng) this.u.c();
        if (drngVar != null) {
            obj = this.q.get();
            ugl uglVar = (ugl) obj;
            bcwz bcwzVar = this.k;
            Uri parse = Uri.parse(drngVar.b);
            bcxb C = bcxc.C();
            bcqk bcqkVar = (bcqk) C;
            bcqkVar.c = true != ((Boolean) ardj.a.e()).booleanValue() ? "audio/amr" : "audio/mp4";
            bcqkVar.d = parse;
            bcqkVar.e = parse;
            C.g(drngVar.e.toMillis());
            C.o(eohh.AUDIO_CHOOSER);
            MessagePartData c = bcwzVar.c(C.r());
            c.h = dcln.b(c, (dcle) uos.a.a());
            uglVar.c(c);
        }
        h();
        i();
    }

    private final void h() {
        ugg uggVar = this.p;
        if (uggVar.c() == ugo.VOICE) {
            uggVar.h(false);
        }
    }

    private final void i() {
        this.r = null;
        this.s.f(dtja.b);
        this.t.f(null);
        this.u.f(null);
    }

    private final void j(int i) {
        this.t.f(Integer.valueOf(i));
    }

    private final void k() {
        this.l.a();
        if (this.h.d()) {
            this.n.c(e().toSeconds(), 6, eqln.NOISE_CANCELLATION_STATE_UNKNOWN);
            Uri b = this.h.b();
            if (b != null) {
                fgcm fgcmVar = this.u;
                drjx drjxVar = ((Boolean) ardj.a.e()).booleanValue() ? drjk.a : drji.a;
                String uri = b.toString();
                uri.getClass();
                Instant now = Instant.now();
                now.getClass();
                dtem dtemVar = dtem.a;
                Duration e = e();
                e.getClass();
                fgcmVar.f(new drng(drjxVar, uri, null, null, 0L, now, dtemVar, e, null, 268));
                this.s.f(dtjb.c);
            }
        }
    }

    @Override // defpackage.dtik
    public final void a(boolean z, boolean z2, dteh dtehVar) {
        if (z) {
            g();
            return;
        }
        f();
        if (z2) {
            h();
        }
    }

    @Override // defpackage.dtik
    public final void b() {
        Object obj;
        i();
        this.r = this.j.f();
        obj = this.q.get();
        if (this.h.e(this, this, (int) ((Number) ((ugl) obj).e().b.invoke()).longValue())) {
            this.s.f(dtjb.b);
        } else {
            j(R.string.audio_recording_start_failed);
        }
        arca arcaVar = this.l;
        arcaVar.c = axol.k(arcaVar.a, null, new arbz(arcaVar, null), 3);
    }

    @Override // defpackage.dtik
    public final void c() {
        k();
    }

    @Override // defpackage.dtik
    public final void d(dteh dtehVar) {
        g();
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        ensk i3 = g.i();
        i3.Y(ente.a, "Bugle");
        ((enrr) i3.h("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController", "onError", 225, "VoiceRecordingController.kt")).u("Error occurred during audio recording what=%s, extra=%s", i, i2);
        this.o.b(6);
        f();
        j(R.string.audio_recording_error);
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        if (i == 800) {
            ensk h = g.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController", "onInfo", 234, "VoiceRecordingController.kt")).q("Max duration reached while recording audio");
            this.m.k(R.string.audio_recorder_time_limit_reached_text);
            k();
            return;
        }
        if (i != 801) {
            return;
        }
        ensk h2 = g.h();
        h2.Y(ente.a, "Bugle");
        ((enrr) h2.h("com/google/android/apps/messaging/conversation/input/compose/voice/VoiceRecordingController", "onInfo", 239, "VoiceRecordingController.kt")).q("Max size reached while recording audio");
        k();
    }
}
