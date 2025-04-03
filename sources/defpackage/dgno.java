package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgno {
    public final Activity a;
    public final emyl b;

    public dgno(final Activity activity) {
        this.a = activity;
        this.b = new emyl() { // from class: dgnn
            @Override // defpackage.emyl
            public final Object get() {
                dfqs dfqsVar = dgnq.a;
                return new dgop(activity);
            }
        };
    }

    public final int a() {
        int i = dfqe.a;
        return dfqf.b(this.a, 11925000);
    }

    final void b(int i, GoogleHelp googleHelp) {
        final Intent data = new Intent("android.intent.action.VIEW").setData(googleHelp.q);
        if (i == 7) {
            i = 7;
        } else if (!this.a.getPackageManager().queryIntentActivities(data, 0).isEmpty()) {
            new dgxx(Looper.getMainLooper()).post(new Runnable() { // from class: dgnm
                @Override // java.lang.Runnable
                public final void run() {
                    dgno.this.a.startActivity(data);
                }
            });
            return;
        }
        Activity activity = this.a;
        int i2 = dfqe.a;
        if (true == dfqf.f(activity, i)) {
            i = 18;
        }
        dfpi.a.e(activity, i, 0, null);
    }

    public final void c(final Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int a = a();
        if (a != 0) {
            b(a, (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP"));
            return;
        }
        Object obj = this.b.get();
        final dgop dgopVar = (dgop) obj;
        dfwv.n(dgopVar.a);
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dgon
            @Override // defpackage.dfuf
            public final void a(Object obj2, Object obj3) {
                dgoq dgoqVar = (dgoq) obj2;
                dgnk dgnkVar = dgoqVar.a;
                WeakReference weakReference = new WeakReference(dgop.this.a);
                Intent intent2 = intent;
                GoogleHelp googleHelp = (GoogleHelp) intent2.getParcelableExtra("EXTRA_GOOGLE_HELP");
                ((dgom) dgnkVar).a(googleHelp);
                dgot.a(new dgod(dgoqVar, weakReference, intent2, googleHelp.R), googleHelp);
            }
        };
        dfunVar.c = 34401;
        ((dfra) obj).l(dfunVar.a());
    }

    public final void d(final InProductHelp inProductHelp) {
        if (TextUtils.isEmpty(inProductHelp.c)) {
            throw new IllegalArgumentException("The content URL must be non-empty.");
        }
        int a = a();
        if (a != 0) {
            b(a, inProductHelp.a);
            return;
        }
        Object obj = this.b.get();
        dfun dfunVar = new dfun();
        final dgop dgopVar = (dgop) obj;
        dfunVar.a = new dfuf() { // from class: dgoo
            @Override // defpackage.dfuf
            public final void a(Object obj2, Object obj3) {
                dgoq dgoqVar = (dgoq) obj2;
                dgnk dgnkVar = dgoqVar.a;
                WeakReference weakReference = new WeakReference(dgop.this.a);
                InProductHelp inProductHelp2 = inProductHelp;
                GoogleHelp googleHelp = inProductHelp2.a;
                ((dgom) dgnkVar).a(googleHelp);
                dgot.a(new dgoe(inProductHelp2, dgoqVar, weakReference, googleHelp.R), googleHelp);
            }
        };
        dfunVar.c = 34402;
        ((dfra) obj).l(dfunVar.a());
    }
}
