package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnn {
    private final Context a;
    private final String b;
    private final fakk c;

    public efnn(Context context, String str, fakk fakkVar) {
        this.a = context;
        this.b = str;
        this.c = fakkVar;
    }

    public final void a(efnh efnhVar, boolean z) {
        fait faitVar;
        efog a = efmu.a.d.a(this.a, this.b, efnhVar.b, emxe.b(efnhVar.f));
        fahx fahxVar = (fahx) faiu.a.createBuilder();
        long epochMilli = Instant.now().toEpochMilli() - efnhVar.d;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(epochMilli);
        long nanos = TimeUnit.MILLISECONDS.toNanos(epochMilli - (TimeUnit.SECONDS.toMillis(1L) * seconds));
        eyeu eyeuVar = (eyeu) eyev.a.createBuilder();
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).b = seconds;
        eyeuVar.copyOnWrite();
        ((eyev) eyeuVar.instance).c = (int) nanos;
        eyev eyevVar = (eyev) eyeuVar.build();
        fahxVar.copyOnWrite();
        faiu faiuVar = (faiu) fahxVar.instance;
        eyevVar.getClass();
        faiuVar.e = eyevVar;
        faiuVar.b |= 1;
        int i = efnhVar.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            if (((efnm) efmy.a.e.get(this.c.b)) == efnm.EMBEDDED) {
                fais faisVar = (fais) fait.a.createBuilder();
                faisVar.copyOnWrite();
                fait faitVar2 = (fait) faisVar.instance;
                faitVar2.c = 1;
                faitVar2.b |= 1;
                faitVar = (fait) faisVar.build();
            } else {
                faitVar = fait.a;
            }
            fahxVar.copyOnWrite();
            faiu faiuVar2 = (faiu) fahxVar.instance;
            faitVar.getClass();
            faiuVar2.d = faitVar;
            faiuVar2.c = 2;
        } else if (i2 == 2) {
            faio faioVar = (faio) faip.a.createBuilder();
            fajm fajmVar = efnhVar.c;
            if (fajmVar != null) {
                if (!z) {
                    fajh fajhVar = (fajh) fajmVar.toBuilder();
                    fajhVar.copyOnWrite();
                    fajm fajmVar2 = (fajm) fajhVar.instance;
                    fajmVar2.c = null;
                    fajmVar2.b &= -2;
                    fajmVar = (fajm) fajhVar.build();
                }
                faioVar.copyOnWrite();
                faip faipVar = (faip) faioVar.instance;
                fajmVar.getClass();
                faipVar.c = fajmVar;
                faipVar.b |= 2;
            }
            faip faipVar2 = (faip) faioVar.build();
            fahxVar.copyOnWrite();
            faiu faiuVar3 = (faiu) fahxVar.instance;
            faipVar2.getClass();
            faiuVar3.d = faipVar2;
            faiuVar3.c = 3;
        } else if (i2 == 3) {
            fahy fahyVar = (fahy) fahz.a.createBuilder();
            boolean z2 = efnhVar.e;
            fahyVar.copyOnWrite();
            ((fahz) fahyVar.instance).b = z2;
            fahz fahzVar = (fahz) fahyVar.build();
            fahxVar.copyOnWrite();
            faiu faiuVar4 = (faiu) fahxVar.instance;
            fahzVar.getClass();
            faiuVar4.d = fahzVar;
            faiuVar4.c = 4;
        } else if (i2 == 4) {
            fain fainVar = efnhVar.a;
            fahxVar.copyOnWrite();
            faiu faiuVar5 = (faiu) fahxVar.instance;
            fainVar.getClass();
            faiuVar5.d = fainVar;
            faiuVar5.c = 5;
        } else if (i2 != 5) {
            Log.e("SurveyAnswerTransmitter", "Invalid survey answer type specified.");
        } else {
            fair fairVar = fair.a;
            fahxVar.copyOnWrite();
            faiu faiuVar6 = (faiu) fahxVar.instance;
            fairVar.getClass();
            faiuVar6.d = fairVar;
            faiuVar6.c = 6;
        }
        fakk fakkVar = this.c;
        long j = efow.a;
        if (fakkVar == null || fakkVar.b.isEmpty() || fakkVar.c.H()) {
            Log.e("SurveyAnswerTransmitter", "Session is invalid, dropping event.");
        } else {
            fagn fagnVar = (fagn) fago.a.createBuilder();
            fakk fakkVar2 = this.c;
            fagnVar.copyOnWrite();
            fago fagoVar = (fago) fagnVar.instance;
            fakkVar2.getClass();
            fagoVar.d = fakkVar2;
            fagoVar.b |= 2;
            faiu faiuVar7 = (faiu) fahxVar.build();
            fagnVar.copyOnWrite();
            fago fagoVar2 = (fago) fagnVar.instance;
            faiuVar7.getClass();
            fagoVar2.c = faiuVar7;
            fagoVar2.b |= 1;
            final fago fagoVar3 = (fago) fagnVar.build();
            final efou efouVar = new efou();
            if (fagoVar3 == null) {
                Log.e("NetworkCallerGrpc", "Survey record event request was null");
            } else {
                final efnz efnzVar = (efnz) a;
                efnp.a().execute(new Runnable() { // from class: efnr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableFuture a2;
                        ListenableFuture a3;
                        efnz efnzVar2 = efnz.this;
                        emby a4 = efnzVar2.a();
                        fdxk b = efnzVar2.b(a4);
                        if (b == null) {
                            Log.e("NetworkCallerGrpc", "Could not get channel for recordEvent.");
                            return;
                        }
                        efou efouVar2 = efouVar;
                        fago fagoVar4 = fagoVar3;
                        if (!efmu.a.b) {
                            if (a4 != null) {
                                fakw fakwVar = (fakw) fakx.a(b).i(new feee(a4));
                                fdxk fdxkVar = fakwVar.a;
                                febs febsVar = fakx.c;
                                if (febsVar == null) {
                                    synchronized (fakx.class) {
                                        febsVar = fakx.c;
                                        if (febsVar == null) {
                                            febp a5 = febs.a();
                                            a5.c = febr.UNARY;
                                            a5.d = febs.c("scone.v1.SurveyService", "RecordEvent");
                                            a5.b();
                                            fago fagoVar5 = fago.a;
                                            eyfc eyfcVar = ffag.a;
                                            a5.a = new ffae(fagoVar5);
                                            a5.b = new ffae(fagq.a);
                                            febsVar = a5.a();
                                            fakx.c = febsVar;
                                        }
                                    }
                                }
                                a3 = ffat.a(fdxkVar.a(febsVar, fakwVar.b), fagoVar4);
                            } else {
                                fakw a6 = fakx.a(b);
                                fdxk fdxkVar2 = a6.a;
                                febs febsVar2 = fakx.d;
                                if (febsVar2 == null) {
                                    synchronized (fakx.class) {
                                        febsVar2 = fakx.d;
                                        if (febsVar2 == null) {
                                            febp a7 = febs.a();
                                            a7.c = febr.UNARY;
                                            a7.d = febs.c("scone.v1.SurveyService", "RecordEventAnonymous");
                                            a7.b();
                                            fago fagoVar6 = fago.a;
                                            eyfc eyfcVar2 = ffag.a;
                                            a7.a = new ffae(fagoVar6);
                                            a7.b = new ffae(fagq.a);
                                            febsVar2 = a7.a();
                                            fakx.d = febsVar2;
                                        }
                                    }
                                }
                                a3 = ffat.a(fdxkVar2.a(febsVar2, a6.b), fagoVar4);
                            }
                            erqt.r(a3, new efnu(efnzVar2, fagoVar4, efouVar2), efnp.a());
                            return;
                        }
                        try {
                            fcsp fcspVar = (fcsp) eyfy.parseFrom(fcsp.a, fagoVar4.toByteString(), eyfc.a());
                            if (a4 != null) {
                                fcsz fcszVar = (fcsz) fcta.a(b).i(new feee(a4));
                                fdxk fdxkVar3 = fcszVar.a;
                                febs febsVar3 = fcta.c;
                                if (febsVar3 == null) {
                                    synchronized (fcta.class) {
                                        febsVar3 = fcta.c;
                                        if (febsVar3 == null) {
                                            febp a8 = febs.a();
                                            a8.c = febr.UNARY;
                                            a8.d = febs.c("google.internal.feedback.v1.SurveyService", "RecordEvent");
                                            a8.b();
                                            fcsp fcspVar2 = fcsp.a;
                                            eyfc eyfcVar3 = ffag.a;
                                            a8.a = new ffae(fcspVar2);
                                            a8.b = new ffae(fcsr.a);
                                            febsVar3 = a8.a();
                                            fcta.c = febsVar3;
                                        }
                                    }
                                }
                                a2 = ffat.a(fdxkVar3.a(febsVar3, fcszVar.b), fcspVar);
                            } else {
                                fcsz a9 = fcta.a(b);
                                fdxk fdxkVar4 = a9.a;
                                febs febsVar4 = fcta.d;
                                if (febsVar4 == null) {
                                    synchronized (fcta.class) {
                                        febsVar4 = fcta.d;
                                        if (febsVar4 == null) {
                                            febp a10 = febs.a();
                                            a10.c = febr.UNARY;
                                            a10.d = febs.c("google.internal.feedback.v1.SurveyService", "RecordEventAnonymous");
                                            a10.b();
                                            fcsp fcspVar3 = fcsp.a;
                                            eyfc eyfcVar4 = ffag.a;
                                            a10.a = new ffae(fcspVar3);
                                            a10.b = new ffae(fcsr.a);
                                            febsVar4 = a10.a();
                                            fcta.d = febsVar4;
                                        }
                                    }
                                }
                                a2 = ffat.a(fdxkVar4.a(febsVar4, a9.b), fcspVar);
                            }
                            erqt.r(a2, new efnv(efnzVar2, fagoVar4, efouVar2), efnp.a());
                        } catch (eygu e) {
                            Log.e("NetworkCallerGrpc", "Failed to convert scone record event request to feedback1p.", e);
                        }
                    }
                });
            }
        }
        efnhVar.a = fain.a;
        efnhVar.g = 1;
    }
}
