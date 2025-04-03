package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassifier;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewyy {
    private static final Object b = new Object();
    private static final WeakHashMap c = new WeakHashMap();
    public final ewzc a;

    public ewyy(Context context) {
        TextClassifier textClassifier;
        int i = ewyj.b;
        textClassifier = iy$$ExternalSyntheticApiModelOutline1.m415m(context.getSystemService("textclassification")).getTextClassifier();
        this.a = new ewyj(context, textClassifier);
    }

    public static ewyy a(Context context) {
        ewyy ewyyVar;
        synchronized (b) {
            WeakHashMap weakHashMap = c;
            WeakReference weakReference = (WeakReference) weakHashMap.get(context);
            ewyyVar = weakReference != null ? (ewyy) weakReference.get() : null;
            if (ewyyVar == null) {
                ewyyVar = new ewyy(context);
                weakHashMap.put(context, new WeakReference(ewyyVar));
            }
        }
        return ewyyVar;
    }
}
