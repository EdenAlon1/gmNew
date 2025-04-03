package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyw implements SharedPreferences {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences");
    public final duyv b;
    public ICrossProcessPreferenceServer e;
    private final Context f;
    private final String g;
    private final ICrossProcessPreferenceClient h;
    public final Map c = new HashMap();
    public final Set d = new HashSet();
    private final IBinder.DeathRecipient i = new IBinder.DeathRecipient() { // from class: duys
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            duyw duywVar = duyw.this;
            synchronized (duywVar) {
                duywVar.e = null;
            }
        }
    };

    public duyw(Context context) {
        this.f = context;
        int i = dvas.a;
        String concat = String.valueOf(context.getPackageName()).concat(".wdb");
        this.g = concat;
        this.b = new duyv(context, concat);
        this.h = new duyt(this);
    }

    public static dvay a(Context context, String str, dvau dvauVar) {
        int a2;
        try {
            dvay a3 = dvbj.a(dvbj.b(context, str, dvauVar));
            if (a3 != null && (a2 = dvax.a(a3.b)) != 0 && a2 == 201) {
                return a3;
            }
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "sendRequest", 341, "CrossProcessSharedPreferences.java")).q("The response of the request is invalid");
            return null;
        } catch (Exception e) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "sendRequest", (char) 334, "CrossProcessSharedPreferences.java")).q("Fail to send WDB request");
            return null;
        }
    }

    private final Object e(String str, Class cls, Object obj) {
        Object obj2;
        synchronized (this) {
            obj2 = this.c.get(str);
        }
        return cls.isInstance(obj2) ? cls.cast(obj2) : obj;
    }

    private final synchronized boolean f(IBinder iBinder) {
        ICrossProcessPreferenceServer asInterface = ICrossProcessPreferenceServer.Stub.asInterface(iBinder);
        try {
            if (!asInterface.register(this.h)) {
                ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", PrivateKeyType.INVALID, "CrossProcessSharedPreferences.java")).q("Failed to register to the server.");
                return false;
            }
            this.e = asInterface;
            try {
                iBinder.linkToDeath(this.i, 0);
            } catch (Exception e) {
                ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", (char) 268, "CrossProcessSharedPreferences.java")).q("Failed to add deathRecipient.");
            }
            return true;
        } catch (Exception e2) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", (char) 259, "CrossProcessSharedPreferences.java")).q("Failed to register to the server.");
            return false;
        }
    }

    final synchronized void b() {
        ICrossProcessPreferenceServer iCrossProcessPreferenceServer = this.e;
        if (iCrossProcessPreferenceServer == null) {
            return;
        }
        try {
            try {
                iCrossProcessPreferenceServer.unregister(this.h);
            } catch (Exception e) {
                ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "disconnectServer", (char) 282, "CrossProcessSharedPreferences.java")).q("Failed to unregister from the server.");
            }
            try {
                iCrossProcessPreferenceServer.asBinder().unlinkToDeath(this.i, 0);
            } catch (RuntimeException e2) {
                ((enrr) ((enrr) ((enrr) a.j()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "disconnectServer", (char) 291, "CrossProcessSharedPreferences.java")).q("Failed to remove death recipient.");
            }
        } finally {
            this.e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void c() {
        Bundle bundle;
        int a2;
        eyfw checkIsLite;
        synchronized (this) {
            if (this.e != null) {
                return;
            }
            enhd enhdVar = new enhd();
            IBinder iBinder = null;
            try {
                Context context = this.f;
                String str = this.g;
                dvat dvatVar = (dvat) dvau.a.createBuilder();
                long millis = dumc.a.d().toMillis();
                dvatVar.copyOnWrite();
                dvau dvauVar = (dvau) dvatVar.instance;
                dvauVar.b |= 1;
                dvauVar.c = millis;
                eyfw eyfwVar = dvbg.b;
                dvaz dvazVar = (dvaz) dvbg.a.createBuilder();
                dvbb dvbbVar = dvbb.a;
                dvazVar.copyOnWrite();
                dvbg dvbgVar = (dvbg) dvazVar.instance;
                dvbbVar.getClass();
                dvbgVar.d = dvbbVar;
                dvbgVar.c = 2;
                dvatVar.e(eyfwVar, (dvbg) dvazVar.build());
                bundle = dvbj.b(context, str, (dvau) dvatVar.build());
            } catch (Exception e) {
                ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", (char) 212, "CrossProcessSharedPreferences.java")).q("Failed to send FETCH_PREFERENCES request");
                bundle = null;
            }
            if (bundle == null) {
                ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 215, "CrossProcessSharedPreferences.java")).q("The result bundle of FETCH_PREFERENCES is null.");
            } else {
                IBinder binder = bundle.getBinder("binder");
                if (binder == null) {
                    ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 222, "CrossProcessSharedPreferences.java")).q("The result bundle doesn't contain a binder");
                } else {
                    dvay a3 = dvbj.a(bundle);
                    if (a3 != null && (a2 = dvax.a(a3.b)) != 0 && a2 == 201) {
                        checkIsLite = eyfy.checkIsLite(dvbi.b);
                        a3.b(checkIsLite);
                        Object l = a3.r.l(checkIsLite.d);
                        duyr duyrVar = ((dvbi) (l == null ? checkIsLite.b : checkIsLite.c(l))).c;
                        if (duyrVar == null) {
                            duyrVar = duyr.a;
                        }
                        for (duzc duzcVar : duyrVar.b) {
                            try {
                                enhdVar.k(duzcVar.e, duzk.f(duzcVar));
                            } catch (IllegalArgumentException e2) {
                                ((enrr) ((enrr) ((enrr) a.j()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 241, "CrossProcessSharedPreferences.java")).t("Failed to get preference elem value for %s", duzcVar.e);
                            }
                        }
                        iBinder = binder;
                    }
                    ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 229, "CrossProcessSharedPreferences.java")).q("The response of FETCH_PREFERENCES request is null.");
                }
            }
            if (iBinder == null) {
                return;
            }
            if (f(iBinder)) {
                enhk b = enhdVar.b();
                enhk j = enhk.j(this.c);
                this.c.clear();
                this.c.putAll(b);
                enip o = enip.o(this.d);
                enin eninVar = new enin();
                Set[] setArr = {j.keySet(), b.keySet()};
                enin eninVar2 = new enin();
                for (int i = 0; i < 2; i++) {
                    eninVar2.j(setArr[i]);
                }
                enqu listIterator = eninVar2.g().listIterator();
                while (listIterator.hasNext()) {
                    String str2 = (String) listIterator.next();
                    Object obj = b.get(str2);
                    if (obj == null || !obj.equals(j.get(str2))) {
                        eninVar.c(str2);
                    }
                }
                d(o, eninVar.g());
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.c.containsKey(str);
    }

    public final void d(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(this, str);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final /* synthetic */ SharedPreferences.Editor edit() {
        return this.b;
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        return this.c;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) e(str, Boolean.class, Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return ((Float) e(str, Float.class, Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return ((Integer) e(str, Integer.class, Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return ((Long) e(str, Long.class, Long.valueOf(j))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) e(str, String.class, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) e(str, Set.class, set);
    }

    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.remove(onSharedPreferenceChangeListener);
    }
}
