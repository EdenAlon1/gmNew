package defpackage;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghq extends dghp {
    public dghq() {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
    }

    @Override // defpackage.dghp
    public final FeedbackOptions a() {
        dfwv.n(this.h.crashInfo.exceptionClassName);
        dfwv.n(this.h.crashInfo.throwClassName);
        dfwv.n(this.h.crashInfo.throwMethodName);
        dfwv.n(this.h.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.h.crashInfo.throwFileName)) {
            this.h.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions a = super.a();
        a.d.crashInfo = this.h.crashInfo;
        a.g = null;
        return a;
    }

    public dghq(Throwable th) {
        this.h = new ApplicationErrorReport();
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.h.crashInfo.throwLineNumber = -1;
        this.h.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }
}
