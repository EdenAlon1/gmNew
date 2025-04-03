package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.media.AudioManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbsx implements dbrt {
    public final dbru a;
    public final Set b = new cmj();
    public final akzt c;
    public final albq d;
    int e;
    private final ffbr f;
    private final cstj g;
    private final errl h;

    public dbsx(cstj cstjVar, akzt akztVar, albq albqVar, ffbr ffbrVar, errl errlVar, dbru dbruVar) {
        this.g = cstjVar;
        this.c = akztVar;
        this.d = albqVar;
        this.f = ffbrVar;
        this.h = errlVar;
        this.a = dbruVar;
        synchronized (this) {
            this.e = 1;
        }
    }

    @Override // defpackage.dbrt
    public final void a(String str) {
        AudioManager audioManager;
        VibrationEffect createOneShot;
        this.c.c("Bugle.Ditto.Pairing.Attempted");
        this.d.b("Bugle.Ditto.Pairing.Latency");
        dbsl dbslVar = (dbsl) this.a;
        Vibrator vibrator = (Vibrator) dbslVar.i.getSystemService("vibrator");
        if (vibrator != null && ((audioManager = (AudioManager) dbslVar.i.getSystemService("audio")) == null || audioManager.getRingerMode() != 0)) {
            createOneShot = VibrationEffect.createOneShot(300L, -1);
            vibrator.vibrate(createOneShot);
        }
        int indexOf = str.indexOf("?c=");
        final cstl cstlVar = null;
        cstlVar = null;
        cstlVar = null;
        cstlVar = null;
        cstlVar = null;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 3);
            csjy.c("Bugle", "Detected QR code");
            try {
                try {
                    esaj esajVar = (esaj) eyfy.parseFrom(esaj.a, Base64.decode(substring, 0));
                    byte[] I = esajVar.c.I();
                    byte[] I2 = esajVar.d.I();
                    int length = I.length;
                    if (length != 32) {
                        ensk j = cstp.a.j();
                        j.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", 47, "PairingCodeConverter.java")).r("Invalid encryption key length: %d", length);
                    } else {
                        int length2 = I2.length;
                        if (length2 != 32) {
                            ensk j2 = cstp.a.j();
                            j2.Y(ente.a, "Bugle");
                            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", 51, "PairingCodeConverter.java")).r("Invalid HMAC key length: %d", length2);
                        } else {
                            byte[] I3 = esajVar.b.I();
                            cstn cstnVar = new cstn();
                            if (I3 == null) {
                                throw new NullPointerException("Null retrievalToken");
                            }
                            cstnVar.b = I;
                            cstnVar.a = I2;
                            if (substring == null) {
                                throw new NullPointerException("Null originalQrCode");
                            }
                            bcyo bcyoVar = Optional.empty().isEmpty() ? new bcyo(cstnVar.b, cstnVar.a) : null;
                            if (bcyoVar == null) {
                                throw new IllegalStateException("Missing required properties:".concat(" encryptionKeys"));
                            }
                            cstlVar = new cstl(I3, bcyoVar, substring);
                        }
                    }
                } catch (eygu e) {
                    ensk j3 = cstp.a.j();
                    j3.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j3).g(e)).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", '(', "PairingCodeConverter.java")).q("Retrieved code has invalid payload.");
                }
            } catch (IllegalArgumentException unused) {
                ensk j4 = cstp.a.j();
                j4.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", 32, "PairingCodeConverter.java")).t("Scanned code has invalid base64 data: %s", substring);
            }
        }
        if (cstlVar == null) {
            cslq.f(new Runnable() { // from class: dbsr
                @Override // java.lang.Runnable
                public final void run() {
                    dbsx dbsxVar = dbsx.this;
                    dbsxVar.a.a(false);
                    final dbsl dbslVar2 = (dbsl) dbsxVar.a;
                    ehft ehftVar = new ehft(dbslVar2.i);
                    ehftVar.y(dbslVar2.i.getResources().getString(R.string.invalid_qr_code_dialog_title));
                    ehftVar.n(dbslVar2.i.getResources().getString(R.string.invalid_qr_code_dialog_message, bzaq.i.e()));
                    ehftVar.u(dbslVar2.i.getResources().getString(R.string.invalid_qr_code_dialog_positive_button_text), new DialogInterface.OnClickListener() { // from class: dbse
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dbsl.this.a(true);
                            dialogInterface.dismiss();
                        }
                    });
                    ehftVar.a();
                }
            });
            return;
        }
        csjy.c("Bugle", "Successfully parsed QR code");
        ((bzea) this.f.b()).p(cstlVar.c);
        this.a.a(false);
        synchronized (this) {
            this.e = 2;
        }
        final cstj cstjVar = this.g;
        ((chep) cstjVar.b.b()).a(new chwl(cstlVar, cstjVar.e, cstjVar.f)).i(new eroh() { // from class: csth
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final esls eslsVar;
                final fbzk fbzkVar = (fbzk) obj;
                csjy.c("BugleDitto", "Retrieved pairing data.");
                try {
                    eslsVar = (esls) eyfy.parseFrom(esls.a, fbzkVar.d);
                } catch (eygu unused2) {
                    csjy.n("BugleDitto", "Pairing payload didn't contain PairingData");
                    eslsVar = null;
                }
                final csto cstoVar = cstlVar;
                final cstj cstjVar2 = cstj.this;
                if (((cgcu) cstjVar2.h.b()).a()) {
                    return (((Optional) cstjVar2.g.b()).isEmpty() ? elfo.e(null) : ((bzjz) ((Optional) cstjVar2.g.b()).get()).a().h(new emwl() { // from class: cstb
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            emyl emylVar = cstj.a;
                            return null;
                        }
                    }, erpp.a)).i(new eroh() { // from class: cstc
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return cstj.this.a(fbzkVar, cstoVar, eslsVar);
                        }
                    }, erpp.a).i(new eroh() { // from class: cstd
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return ((chep) cstj.this.b.b()).a((chsc) obj2);
                        }
                    }, cstjVar2.d).h(new emwl() { // from class: cste
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            fcek fcekVar = (fcek) obj2;
                            cstj.this.c.a(fcekVar);
                            return new cstk(fcekVar, eslsVar, ((cstl) cstoVar).b);
                        }
                    }, erpp.a);
                }
                return cstjVar2.a(fbzkVar, cstoVar, eslsVar).i(new eroh() { // from class: cstf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ((chep) cstj.this.b.b()).a((chsc) obj2);
                    }
                }, cstjVar2.d).h(new emwl() { // from class: cstg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        fcek fcekVar = (fcek) obj2;
                        cstj.this.c.a(fcekVar);
                        return new cstk(fcekVar, eslsVar, ((cstl) cstoVar).b);
                    }
                }, erpp.a);
            }
        }, cstjVar.d).h(new emwl() { // from class: csti
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cstj.this.b((cstm) obj);
                return null;
            }
        }, cstjVar.d).h(new emwl() { // from class: dbsn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return true;
            }
        }, erpp.a).e(Throwable.class, new emwl() { // from class: dbso
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                csjy.p("Bugle", (Throwable) obj, "Failed to register pairing for scanned QR code");
                dbsx dbsxVar = dbsx.this;
                dbsxVar.a.a(true);
                dbsxVar.b();
                return false;
            }
        }, this.h).h(new emwl() { // from class: dbsp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                dbsx dbsxVar = dbsx.this;
                dbsxVar.c.c("Bugle.Ditto.Pairing.Success");
                dbsxVar.d.n("Bugle.Ditto.Pairing.Latency");
                dbsxVar.d();
                return null;
            }
        }, this.h);
        cslq.a.postDelayed(new Runnable() { // from class: dbsq
            @Override // java.lang.Runnable
            public final void run() {
                dbsx.this.g();
            }
        }, 200L);
    }

    public final synchronized void b() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 4) {
                this.e = 5;
                return;
            } else if (i2 != 5 && i2 != 6) {
                csjy.n("Bugle", "Unexpected state transition when trying to show failure dialog: ".concat(dbsw.a(i)));
                return;
            }
        }
        this.e = 7;
        cslq.f(new Runnable() { // from class: dbsu
            @Override // java.lang.Runnable
            public final void run() {
                dbsx.this.f();
            }
        });
    }

    public final synchronized void c() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 2) {
            this.e = 6;
            return;
        }
        if (i2 == 3) {
            this.e = 6;
            d();
        } else if (i2 == 4) {
            this.e = 6;
            b();
        } else {
            if (i2 == 6 || i2 == 7) {
                return;
            }
            csjy.n("Bugle", "Unexpected state transition when trying to handle loading complete: ".concat(dbsw.a(i)));
        }
    }

    public final synchronized void d() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                this.e = 4;
                return;
            } else if (i2 != 5 && i2 != 7) {
                csjy.n("Bugle", "Unexpected state transition when trying to show success dialog: ".concat(dbsw.a(i)));
                return;
            }
        }
        this.e = 8;
        cslq.f(new Runnable() { // from class: dbsv
            @Override // java.lang.Runnable
            public final void run() {
                dbsx.this.h();
            }
        });
    }

    public final synchronized void e() {
        dbsk dbskVar = ((dbsl) this.a).m;
        if (((asmo) ((dbqk) dbskVar).o.b()).a()) {
            ((dbqk) dbskVar).e.finish();
        } else {
            ((dbqk) dbskVar).e.finish();
        }
        this.e = 9;
    }

    public final synchronized void f() {
        dbru dbruVar = this.a;
        if (((dbsl) dbruVar).j.aF()) {
            ((dbsl) dbruVar).d();
            ((dbsl) dbruVar).b(false, false);
            iu iuVar = new iu(((dbsl) dbruVar).i);
            iuVar.c(((dbsl) dbruVar).i.getResources().getString(R.string.failed_qr_pairing_dialog_message));
            final dbsl dbslVar = (dbsl) dbruVar;
            iuVar.i(((dbsl) dbruVar).i.getResources().getString(R.string.failed_qr_pairing_dialog_positive_button_text), new DialogInterface.OnClickListener() { // from class: dbsb
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dbsl dbslVar2 = dbsl.this;
                    dbslVar2.d();
                    dbsk dbskVar = dbslVar2.m;
                    if (adhu.b()) {
                        dbqk dbqkVar = (dbqk) dbskVar;
                        if (dbqkVar.p.isPresent()) {
                            dbqkVar.c(dbqkVar.p);
                            return;
                        }
                    }
                    ((dbqk) dbskVar).c(Optional.empty());
                }
            });
            ((dbsl) dbruVar).s = iuVar.a();
        }
        this.e = 1;
    }

    public final synchronized void g() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            this.e = 3;
            this.a.b(true, true);
            cslq.a.postDelayed(new Runnable() { // from class: dbss
                @Override // java.lang.Runnable
                public final void run() {
                    dbsx.this.c();
                }
            }, 1000L);
        } else {
            if (i2 == 6 || i2 == 7) {
                return;
            }
            csjy.n("Bugle", "Unexpected state transition when trying to show loading dialog: ".concat(dbsw.a(i)));
        }
    }

    public final void h() {
        dbsl dbslVar = (dbsl) this.a;
        if (dbslVar.j.aF()) {
            dbslVar.d();
            View findViewById = dbslVar.r.findViewById(R.id.qr_loading_progress_bar);
            findViewById.animate().cancel();
            ObjectAnimator duration = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(dbslVar.i.getResources().getInteger(android.R.integer.config_shortAnimTime));
            duration.addListener(new dbsg(findViewById));
            List c = dbslVar.c(dbslVar.r.findViewById(R.id.qr_loading_checkmark), dbslVar.r.findViewById(R.id.qr_loading_overlay_background));
            AnimatorSet animatorSet = new AnimatorSet();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                animatorSet.play((Animator) it.next()).after(duration);
            }
            animatorSet.start();
        }
        cslq.a.postDelayed(new Runnable() { // from class: dbst
            @Override // java.lang.Runnable
            public final void run() {
                dbsx.this.e();
            }
        }, 2000L);
    }

    public final synchronized void i() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
                this.a.b(true, false);
                return;
            case 6:
                f();
                return;
            case 7:
                h();
                return;
            default:
                csjy.n("Bugle", "Unexpected state transition when trying to show loading dialog: ".concat(dbsw.a(i)));
                return;
        }
    }
}
