package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvq implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffji b;
    final /* synthetic */ hho c;
    final /* synthetic */ egse d;

    public egvq(boolean z, ffji ffjiVar, egse egseVar, hho hhoVar) {
        this.a = z;
        this.b = ffjiVar;
        this.d = egseVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(1407087220);
            if (this.a) {
                hfdVar.v(1407091631);
                boolean D = hfdVar.D(this.b);
                final ffji ffjiVar = this.b;
                final hho hhoVar = this.c;
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: egvm
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            egvv.c(hhoVar, false);
                            ffji.this.invoke(ewom.OBAKE_PICTURE_PICKER_GOOGLE_PHOTOS_SCREEN);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                egvv.b(R.string.pqe_google_photos, (ffix) f, "googlePhotos", 228756, hfdVar, 3456);
            }
            hfdVar.o();
            hfdVar.v(1407107631);
            boolean D2 = hfdVar.D(this.b);
            final ffji ffjiVar2 = this.b;
            final hho hhoVar2 = this.c;
            Object f2 = hfdVar.f();
            if (D2 || f2 == hfc.a) {
                f2 = new ffix() { // from class: egvn
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        egvv.c(hhoVar2, false);
                        ffji.this.invoke(ewom.OBAKE_PICTURE_PICKER_PAST_PROFILE_PHOTOS_SCREEN);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            egvv.b(R.string.pqe_menu_past_profile_pictures, (ffix) f2, "pastProfilePhotos", 228761, hfdVar, 3456);
            hfdVar.v(1407122727);
            boolean F = hfdVar.F(this.d);
            final egse egseVar = this.d;
            final hho hhoVar3 = this.c;
            Object f3 = hfdVar.f();
            if (F || f3 == hfc.a) {
                f3 = new ffix() { // from class: egvo
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        egvv.c(hhoVar3, false);
                        GoogleHelp googleHelp = new GoogleHelp("google_account_photo_picker");
                        ThemeSettings themeSettings = new ThemeSettings();
                        themeSettings.a = 3;
                        googleHelp.s = themeSettings;
                        egse egseVar2 = egse.this;
                        googleHelp.c(egseVar2.a(), egseVar2.a.getCacheDir());
                        InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
                        inProductHelp.c = "https://support.google.com/accounts/answer/27442";
                        new dgno(egseVar2.a).d(inProductHelp);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            hfdVar.o();
            egvv.b(R.string.pqe_menu_help, (ffix) f3, "help", 228757, hfdVar, 3456);
            hfdVar.v(1407135275);
            boolean F2 = hfdVar.F(this.d);
            final egse egseVar2 = this.d;
            final hho hhoVar4 = this.c;
            Object f4 = hfdVar.f();
            if (F2 || f4 == hfc.a) {
                f4 = new ffix() { // from class: egvp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        egvv.c(hhoVar4, false);
                        egse egseVar3 = egse.this;
                        Context applicationContext = egseVar3.a.getApplicationContext();
                        Status status = dghl.a;
                        new dgho(applicationContext).c(egseVar3.a());
                        return ffcu.a;
                    }
                };
                hfdVar.y(f4);
            }
            hfdVar.o();
            egvv.b(R.string.pqe_menu_send_feedback, (ffix) f4, "feedback", 228755, hfdVar, 3456);
        }
        return ffcu.a;
    }
}
