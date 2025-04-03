package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dghp {
    public Bitmap a;
    public String b;
    public String c;
    public String d;
    public ThemeSettings e;
    public LogOptions f;
    public String g;
    ApplicationErrorReport h;
    private final Bundle i;
    private final List j;
    private boolean k;
    private dghd l;
    private String m;

    @Deprecated
    public dghp() {
        this.i = new Bundle();
        this.j = new ArrayList();
        this.h = new ApplicationErrorReport();
        this.m = dgib.b();
    }

    public FeedbackOptions a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.m = this.a;
        feedbackOptions.f = null;
        feedbackOptions.a = this.b;
        feedbackOptions.c = this.c;
        feedbackOptions.b = this.i;
        feedbackOptions.e = this.d;
        feedbackOptions.h = this.j;
        feedbackOptions.i = false;
        feedbackOptions.j = this.e;
        feedbackOptions.k = this.f;
        feedbackOptions.l = this.k;
        feedbackOptions.t = this.l;
        feedbackOptions.n = this.m;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        feedbackOptions.q = false;
        feedbackOptions.r = this.g;
        feedbackOptions.s = null;
        return feedbackOptions;
    }

    final void b(boolean z) {
        if ((!this.i.isEmpty() || !this.j.isEmpty()) && this.k != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.k = z;
    }

    @Deprecated
    public final void c(String str, String str2) {
        if (this.k) {
            throw new IllegalStateException("Can't call addPsd after psd is already certified pii free");
        }
        this.i.putString(str, str2);
    }

    public final void d(dghd dghdVar, boolean z) {
        b(z);
        this.l = dghdVar;
    }

    public final void e(String str) {
        b(false);
        this.i.putString("Exception", str);
    }

    public dghp(Context context) {
        String b;
        dihh.b(context);
        this.i = new Bundle();
        this.j = new ArrayList();
        this.h = new ApplicationErrorReport();
        try {
            if (((Boolean) dgid.a.a()).booleanValue()) {
                b = System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong());
            } else {
                b = dgib.b();
            }
            this.m = b;
        } catch (SecurityException unused) {
            this.m = dgib.b();
        }
    }
}
