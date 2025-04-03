package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kns {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public kns(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput[] a(kns[] knsVarArr) {
        RemoteInput[] remoteInputArr = new RemoteInput[knsVarArr.length];
        for (int i = 0; i < knsVarArr.length; i++) {
            kns knsVar = knsVarArr[i];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(knsVar.a).setLabel(knsVar.b).setChoices(knsVar.c).setAllowFreeFormInput(knsVar.d).addExtras(knsVar.f);
            Iterator it = knsVar.g.iterator();
            while (it.hasNext()) {
                addExtras.setAllowDataType((String) it.next(), true);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(knsVar.e);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
