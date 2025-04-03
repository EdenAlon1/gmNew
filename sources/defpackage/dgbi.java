package defpackage;

import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dgbi {
    final String d;
    public final DroidGuardResultsRequest e;
    boolean f = false;
    final dgci g;

    public dgbi(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
        dgch dgchVar;
        int i = 0;
        this.d = str;
        if (droidGuardResultsRequest == null) {
            this.e = new DroidGuardResultsRequest();
        } else {
            this.e = droidGuardResultsRequest;
        }
        String[] split = fdmj.b().split(",");
        int length = split.length;
        while (true) {
            if (i >= length) {
                dgchVar = dgch.COARSE;
                break;
            } else {
                if (str.equals(split[i])) {
                    dgchVar = dgch.FINE;
                    break;
                }
                i++;
            }
        }
        this.g = new dgci(dgchVar, dfym.a);
    }

    final void d(dgau dgauVar) {
        synchronized (this) {
            if (this.f) {
                dgauVar.close();
                return;
            }
            this.f = true;
            try {
                c(dgauVar);
            } catch (Exception unused) {
            }
        }
    }

    protected void c(dgau dgauVar) {
    }
}
