package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdc implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        pcv pcvVar = (pcv) ((View) obj).getLayoutParams();
        pcv pcvVar2 = (pcv) ((View) obj2).getLayoutParams();
        boolean z = pcvVar.a;
        return z != pcvVar2.a ? !z ? -1 : 1 : pcvVar.e - pcvVar2.e;
    }
}
