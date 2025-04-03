package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import defpackage.dvaj;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duzk extends duyy implements duof {
    public static final a a;
    public static final Object b;
    public static final Object c;
    public static final Map d;
    private static final entd k = duwi.a;
    private static volatile duzk l;
    public final boolean e;
    public final duze g;
    public volatile duyz h;
    private final cmh m = new cmh();
    private final SharedPreferences.OnSharedPreferenceChangeListener n = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: duzf
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str == null) {
                return;
            }
            duzk duzkVar = duzk.this;
            if (duzkVar.f.get()) {
                duzkVar.h(str, str);
                duzkVar.h("", str);
            }
        }
    };
    public final AtomicBoolean f = new AtomicBoolean(true);
    private volatile enhk o = enoz.a;
    private volatile enhk p = enoz.a;
    private volatile enhk q = enoz.a;
    public volatile enhk i = enoz.a;
    public volatile enhk j = enoz.a;

    /* compiled from: PG */
    class a extends duxx {
    }

    static {
        a aVar = new a();
        a = aVar;
        b = new duzg();
        c = new duzh();
        duyb.c("Preferences_UserUnlocked", aVar);
        d = new cmh();
    }

    public duzk(Context context, String str) {
        duyz duyzVar;
        boolean isEmpty = TextUtils.isEmpty(str);
        this.e = !isEmpty;
        this.g = new duze(context.getResources());
        boolean a2 = dvao.a(context);
        if (!duzx.a || a2) {
            if (isEmpty) {
                final duzo duzoVar = new duzo(context.getApplicationContext());
                Context a3 = dvas.a(duzoVar.a);
                Context context2 = duzoVar.a;
                if (a3 == context2) {
                    duzoVar.c(PreferenceManager.getDefaultSharedPreferences(context2), false);
                    duzoVar.b = true;
                } else {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(a3);
                    final boolean z = defaultSharedPreferences.getBoolean("has_migrated_to_de_storage", false);
                    duzoVar.c(defaultSharedPreferences, true);
                    final Runnable runnable = new Runnable() { // from class: duzm
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v3, types: [android.content.SharedPreferences, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            String defaultSharedPreferencesName;
                            duzo duzoVar2 = duzo.this;
                            if (!z) {
                                Context context3 = duzoVar2.a;
                                Context a4 = dvas.a(context3);
                                defaultSharedPreferencesName = PreferenceManager.getDefaultSharedPreferencesName(context3);
                                a4.moveSharedPreferencesFrom(context3, defaultSharedPreferencesName);
                                PreferenceManager.getDefaultSharedPreferences(a4).edit().putBoolean("has_migrated_to_de_storage", true).apply();
                                SharedPreferences c2 = duzoVar2.c(PreferenceManager.getDefaultSharedPreferences(a4), true);
                                duzi duziVar = duzoVar2.d;
                                if (duziVar != null) {
                                    duzk duzkVar = duziVar.a;
                                    duzkVar.l(duzkVar.h.get(), c2);
                                }
                            }
                            duzoVar2.b = true;
                            duzoVar2.d();
                        }
                    };
                    Runnable runnable2 = new Runnable() { // from class: duzn
                        @Override // java.lang.Runnable
                        public final void run() {
                            duzo.this.c = null;
                            runnable.run();
                        }
                    };
                    dvaj.a aVar = dvaj.a;
                    duyb.a(aVar);
                    duzoVar.c = new duxz(runnable2, aVar.getClass());
                    duzoVar.c.a(erpp.a);
                }
                duyzVar = duzoVar;
            } else {
                if (!dvaj.a()) {
                    throw new IllegalStateException("Private preferences should not be used before user unlocked");
                }
                duyzVar = new duzl(context.getApplicationContext(), str);
            }
            this.h = duyzVar;
        } else {
            if (!isEmpty) {
                throw new IllegalStateException("Non-main process shouldn't access private preferences");
            }
            this.h = new duyx(context);
        }
        if (isEmpty) {
            duoe.a.a(this);
        }
    }

    public static duzk d(Context context) {
        duzk duzkVar;
        duzk duzkVar2 = l;
        if (duzkVar2 != null) {
            return duzkVar2;
        }
        synchronized (duzk.class) {
            if (l == null) {
                l = new duzk(context.getApplicationContext(), null);
                l.g();
            }
            duzkVar = l;
        }
        return duzkVar;
    }

    static Object f(duzc duzcVar) {
        String str;
        int i = duzcVar.c;
        int a2 = duzb.a(i);
        if (a2 == 0) {
            throw null;
        }
        int i2 = a2 - 1;
        if (i2 == 0) {
            return Boolean.valueOf(i == 2 ? ((Boolean) duzcVar.d).booleanValue() : false);
        }
        if (i2 == 1) {
            return Integer.valueOf(i == 3 ? ((Integer) duzcVar.d).intValue() : 0);
        }
        if (i2 == 2) {
            return Long.valueOf(i == 4 ? ((Long) duzcVar.d).longValue() : 0L);
        }
        if (i2 == 3) {
            return Float.valueOf(i == 5 ? ((Float) duzcVar.d).floatValue() : 0.0f);
        }
        if (i2 == 4) {
            return i == 6 ? (String) duzcVar.d : "";
        }
        if (i2 == 5) {
            return enip.o((i == 7 ? (duzq) duzcVar.d : duzq.a).b);
        }
        switch (duzb.a(i)) {
            case 1:
                str = "BOOL_VALUE";
                break;
            case 2:
                str = "INT_VALUE";
                break;
            case 3:
                str = "LONG_VALUE";
                break;
            case 4:
                str = "FLOAT_VALUE";
                break;
            case 5:
                str = "STRING_VALUE";
                break;
            case 6:
                str = "STRING_SET_VALUE";
                break;
            case 7:
                str = "VALUE_NOT_SET";
                break;
            default:
                str = "null";
                break;
        }
        throw new IllegalArgumentException("Unknown value type: ".concat(str));
    }

    private final synchronized void p(duzj duzjVar, String str) {
        if (!this.m.isEmpty()) {
            if (str.equals("")) {
                int i = 0;
                while (true) {
                    cmh cmhVar = this.m;
                    if (i >= cmhVar.d) {
                        break;
                    }
                    String str2 = (String) cmhVar.d(i);
                    if (!str2.equals("") && ((Set) this.m.g(i)).contains(duzjVar)) {
                        throw new emyx(String.format("The listener is already registered for key: %s", str2));
                    }
                    i++;
                }
            } else {
                Set set = (Set) this.m.get("");
                if (set != null && set.contains(duzjVar)) {
                    throw new emyx("The listener is already registered for all keys");
                }
            }
        }
    }

    private final synchronized void q(SharedPreferences sharedPreferences) {
        if (this.m.isEmpty()) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.n);
        }
    }

    @Override // defpackage.onl
    public final void a(String str) {
        ((Float) e(str, Float.class, Float.valueOf(-1.0f), null)).floatValue();
    }

    @Override // defpackage.duyy
    public final String b(int i) {
        return this.g.a(i);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.content.SharedPreferences, java.lang.Object] */
    public final Object e(String str, Class cls, Object obj, Object obj2) {
        Object obj3 = this.j.get(str);
        if (obj3 == c) {
            obj3 = this.q.get(str);
        } else if (obj3 == null && (obj3 = this.i.get(str)) == null) {
            obj3 = this.q.get(str);
        }
        if (obj3 != null && cls.isInstance(obj3)) {
            return cls.cast(obj3);
        }
        Object obj4 = this.p.get(str);
        if (obj4 == null) {
            obj4 = this.o.get(str);
        }
        if (obj4 instanceof emyl) {
            obj = ((emyl) obj4).get();
        } else if (obj4 != null) {
            obj = obj4;
        }
        if (obj3 != b) {
            try {
                ?? r0 = this.h.get();
                if (cls == Boolean.class) {
                    return cls.cast(Boolean.valueOf(r0.getBoolean(str, ((Boolean) obj).booleanValue())));
                }
                if (cls == Float.class) {
                    return cls.cast(Float.valueOf(r0.getFloat(str, ((Float) obj).floatValue())));
                }
                if (cls == Integer.class) {
                    return cls.cast(Integer.valueOf(r0.getInt(str, ((Integer) obj).intValue())));
                }
                if (cls == Long.class) {
                    return cls.cast(Long.valueOf(r0.getLong(str, ((Long) obj).longValue())));
                }
                if (cls == String.class) {
                    return cls.cast(r0.getString(str, (String) obj));
                }
                if (cls == Set.class) {
                    return cls.cast(r0.getStringSet(str, (Set) obj));
                }
                throw new IllegalArgumentException("Unsupported type ".concat(cls.toString()));
            } catch (ClassCastException e) {
                ((ensz) ((ensz) ((ensz) k.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/Preferences", "get", 955, "Preferences.java")).D("Preference %s is not %s", str, cls);
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return obj;
    }

    public final void g() {
        this.h.b(new duzi(this));
    }

    public final void h(String str, String str2) {
        duzj[] duzjVarArr;
        synchronized (this) {
            Set set = (Set) this.m.get(str);
            if (set == null) {
                duzjVarArr = null;
            } else {
                if (set.isEmpty()) {
                    this.m.remove(str);
                    return;
                }
                duzjVarArr = (duzj[]) set.toArray(new duzj[0]);
            }
            if (duzjVarArr != null) {
                for (duzj duzjVar : duzjVarArr) {
                    if (duzjVar != null) {
                        duzjVar.a(this, str2);
                    }
                }
            }
        }
    }

    public final void i(String str, String str2) {
        this.h.a().putString(str, str2).apply();
    }

    public final synchronized void j(duzj duzjVar, int i) {
        k(duzjVar, this.g.a(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void k(duzj duzjVar, String str) {
        if (duzy.a) {
            p(duzjVar, str);
        }
        q(this.h.get());
        Set set = (Set) this.m.get(str);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
            this.m.put(str, set);
        }
        set.add(duzjVar);
    }

    public final synchronized void l(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        if (sharedPreferences != sharedPreferences2) {
            if (!this.m.isEmpty()) {
                sharedPreferences2.unregisterOnSharedPreferenceChangeListener(this.n);
                sharedPreferences.registerOnSharedPreferenceChangeListener(this.n);
            }
        }
    }

    public final boolean m(int i) {
        return n(b(i));
    }

    public final boolean n(String str) {
        return ((Boolean) e(str, Boolean.class, false, false)).booleanValue();
    }

    public final String o(String str) {
        return (String) e(str, String.class, "", null);
    }
}
