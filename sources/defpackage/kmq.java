package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmq extends knb {
    public PendingIntent a;
    public PendingIntent b;
    public PendingIntent c;
    public boolean d;
    public Integer e;
    public Integer f;
    private int k;
    private knr l;
    private IconCompat m;
    private CharSequence n;

    @Override // defpackage.knb
    protected final String a() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.CharSequence] */
    @Override // defpackage.knb
    public final void b(kls klsVar) {
        String str = null;
        r5 = null;
        Notification.CallStyle a = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = this.k;
            if (i == 1) {
                a = kmp.a(knp.a(this.l), this.b, this.a);
            } else if (i == 2) {
                a = kmp.b(knp.a(this.l), this.c);
            } else if (i == 3) {
                a = kmp.c(knp.a(this.l), this.c, this.a);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: ".concat(String.valueOf(String.valueOf(this.k))));
            }
            if (a != null) {
                a.setBuilder(((kni) klsVar).b);
                Integer num = this.e;
                if (num != null) {
                    kmp.d(a, num.intValue());
                }
                Integer num2 = this.f;
                if (num2 != null) {
                    kmp.e(a, num2.intValue());
                }
                kmp.h(a, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    kmp.g(a, kqk.c(iconCompat, this.g.a));
                }
                kmp.f(a, this.d);
                return;
            }
            return;
        }
        Notification.Builder builder = ((kni) klsVar).b;
        knr knrVar = this.l;
        builder.setContentTitle(knrVar != null ? knrVar.a : null);
        Bundle bundle = this.g.B;
        String charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.g.B.getCharSequence("android.text");
        if (charSequence == null) {
            int i2 = this.k;
            if (i2 == 1) {
                str = this.g.a.getResources().getString(R.string.call_notification_incoming_text);
            } else if (i2 == 2) {
                str = this.g.a.getResources().getString(R.string.call_notification_ongoing_text);
            } else if (i2 == 3) {
                str = this.g.a.getResources().getString(R.string.call_notification_screening_text);
            }
        } else {
            str = charSequence;
        }
        builder.setContentText(str);
        knr knrVar2 = this.l;
        if (knrVar2 != null) {
            IconCompat iconCompat2 = knrVar2.b;
            if (iconCompat2 != null) {
                kmn.a(builder, kqk.c(iconCompat2, this.g.a));
            }
            if (Build.VERSION.SDK_INT >= 28) {
                kmo.a(builder, knp.a(this.l));
            } else {
                kmm.a(builder, this.l.c);
            }
        }
        kmm.b(builder, "call");
    }

    @Override // defpackage.knb
    protected final void d(Bundle bundle) {
        super.d(bundle);
        this.k = bundle.getInt("android.callType");
        this.d = bundle.getBoolean("android.callIsVideo");
        if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
            this.l = knp.b(abj$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable("android.callPerson")));
        } else if (bundle.containsKey("android.callPersonCompat")) {
            this.l = knr.b(bundle.getBundle("android.callPersonCompat"));
        }
        if (bundle.containsKey("android.verificationIcon")) {
            this.m = kqk.e((Icon) bundle.getParcelable("android.verificationIcon"));
        } else if (bundle.containsKey("android.verificationIconCompat")) {
            this.m = IconCompat.f(bundle.getBundle("android.verificationIconCompat"));
        }
        this.n = bundle.getCharSequence("android.verificationText");
        this.a = (PendingIntent) bundle.getParcelable("android.answerIntent");
        this.b = (PendingIntent) bundle.getParcelable("android.declineIntent");
        this.c = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
        this.e = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
        this.f = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
    }

    public final kma e(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
        if (num == null) {
            num = Integer.valueOf(this.g.a.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.g.a.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        kma a = new klz(IconCompat.h(this.g.a, i), spannableStringBuilder, pendingIntent).a();
        a.a.putBoolean("key_action_priority", true);
        return a;
    }

    @Override // defpackage.knb
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putInt("android.callType", this.k);
        bundle.putBoolean("android.callIsVideo", this.d);
        if (this.l != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("android.callPerson", knp.a(this.l));
            } else {
                bundle.putParcelable("android.callPersonCompat", this.l.a());
            }
        }
        IconCompat iconCompat = this.m;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", kqk.c(iconCompat, this.g.a));
        }
        bundle.putCharSequence("android.verificationText", this.n);
        bundle.putParcelable("android.answerIntent", this.a);
        bundle.putParcelable("android.declineIntent", this.b);
        bundle.putParcelable("android.hangUpIntent", this.c);
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.f;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }
}
