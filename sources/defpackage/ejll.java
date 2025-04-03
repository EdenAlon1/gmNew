package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejll {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final cmh b = new cmh();
    public final cmh c = new cmh();
    private final String d;

    public ejll(String str) {
        emxf.b(!emxe.c(str), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.d = str;
    }

    public final int a(Object obj) {
        efbd.c();
        Integer num = (Integer) this.c.get(obj.getClass());
        emxf.p(num != null, "The callback %s has not been registered", obj.getClass());
        emxf.p(b(num.intValue()) == obj, "The callback class %s was registered using a different instance. The instance registered in onCreate() must be the same instance used to listen. You can use a final member variable to safely hold the callback reference for each lifecycle.", obj.getClass());
        return num.intValue();
    }

    public final Object b(int i) {
        efbd.c();
        Object obj = this.b.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.c.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    throw new NullPointerException("Callback not re-registered for: ".concat(String.valueOf(((Class) entry.getKey()).getName())));
                }
            }
        }
        obj.getClass();
        return obj;
    }

    public final void c() {
        efbd.c();
        this.b.clear();
    }

    public final void d(Object obj) {
        efbd.c();
        cmh cmhVar = this.c;
        Class<?> cls = obj.getClass();
        if (cmhVar.containsKey(cls)) {
            Integer num = (Integer) this.c.get(cls);
            num.intValue();
            emxf.p(this.b.put(num, obj) == null, "Attempted to register the callback class %s twice for one `Fragment`. A callback class' type is used to uniquely identify the callback and make sure it's reregistered after a configuration change, preventing state loss after a configuration change. See http://go/tiktok-futures#limitations or http://go/tiktok/dev/dataservice/subscriptionmixin#best-practices. This check can also trigger if new callback classes are registered after process death and recreation from save instance state. This most often happens when experiment flags change. See b/224812898.", cls);
        } else {
            int andIncrement = a.getAndIncrement();
            cmh cmhVar2 = this.c;
            Integer valueOf = Integer.valueOf(andIncrement);
            cmhVar2.put(cls, valueOf);
            this.b.put(valueOf, obj);
        }
    }

    public final void e(Bundle bundle) {
        efbd.c();
        if (bundle != null) {
            String concat = "CallbackIdMap.classes".concat(this.d);
            emxf.m(bundle.containsKey(concat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String str = this.d;
            String[] stringArray = bundle.getStringArray(concat);
            int[] intArray = bundle.getIntArray("CallbackIdMap.class_ids".concat(str));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) this.c.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int intValue = num.intValue();
                        int i2 = intArray[i];
                        emxf.s(intValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void f(Bundle bundle) {
        efbd.c();
        String concat = "CallbackIdMap.classes".concat(this.d);
        emxf.p(!bundle.containsKey(concat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", concat);
        cmh cmhVar = this.c;
        int i = cmhVar.d;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : cmhVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(concat, strArr);
        bundle.putIntArray("CallbackIdMap.class_ids".concat(this.d), iArr);
    }

    public final void g() {
        efbd.c();
        for (Map.Entry entry : this.c.entrySet()) {
            emxf.p(this.b.containsKey((Integer) entry.getValue()), "Did not restore a callback for %s. You must re-register all callbacks you previously had after a configuration change, so that you don't lose user state.", entry.getKey());
        }
    }
}
