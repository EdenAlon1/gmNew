package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class slk implements ffxy {
    final /* synthetic */ fflb a;
    final /* synthetic */ sli b;
    final /* synthetic */ slo c;
    final /* synthetic */ Uri d;

    public slk(fflb fflbVar, sli sliVar, slo sloVar, Uri uri) {
        this.a = fflbVar;
        this.b = sliVar;
        this.c = sloVar;
        this.d = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        sks sksVar = (sks) obj;
        if (sksVar instanceof skq) {
            ((ffud) this.a.a).z();
        } else {
            if (!(sksVar instanceof skr)) {
                throw new ffcd();
            }
            fari fariVar = ((skr) sksVar).a.b;
            if (fariVar == null) {
                fariVar = fari.a;
            }
            sli sliVar = this.b;
            slo sloVar = this.c;
            Uri uri = this.d;
            int i = fariVar.b;
            if (i == 2) {
                farc farcVar = (farc) fariVar.c;
                farcVar.getClass();
                sliVar.b();
                String str = (String) farcVar.b.get(0);
                if (sliVar.b.length() > 0) {
                    StringBuilder sb = sliVar.b;
                    sb.append(" ");
                    sb.append(str);
                    sliVar.c = str.length() + 1;
                } else {
                    sliVar.b.append(str);
                    sliVar.c = str.length();
                }
                farq farqVar = farcVar.c;
                if (farqVar == null) {
                    farqVar = farq.a;
                }
                sliVar.d = ernk.c(farqVar.b);
                sloVar.a(uri, sliVar);
            } else if (i == 1) {
                faqv faqvVar = (faqv) fariVar.c;
                faqvVar.getClass();
                sliVar.b();
                sliVar.b.append((String) faqvVar.b.get(0));
                farq farqVar2 = faqvVar.c;
                if (farqVar2 == null) {
                    farqVar2 = farq.a;
                }
                sliVar.d = ernk.c(farqVar2.b);
                sloVar.a(uri, sliVar);
            }
        }
        return ffcu.a;
    }
}
