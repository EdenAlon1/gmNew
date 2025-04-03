package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obo extends ffkk implements ffix {
    final /* synthetic */ NavHostFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obo(NavHostFragment navHostFragment) {
        super(0);
        this.a = navHostFragment;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle;
        Parcelable[] parcelableArr;
        lkk P;
        Context z = this.a.z();
        if (z == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
        final nzn nznVar = new nzn(z);
        final NavHostFragment navHostFragment = this.a;
        if (!ffkj.e(navHostFragment, nznVar.k)) {
            lkr lkrVar = nznVar.k;
            if (lkrVar != null && (P = lkrVar.P()) != null) {
                P.d(nznVar.o);
            }
            nznVar.k = navHostFragment;
            navHostFragment.P().c(nznVar.o);
        }
        lmx S = navHostFragment.S();
        if (!ffkj.e(nznVar.l, nym.a(S))) {
            if (!nznVar.f.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call");
            }
            nznVar.l = nym.a(S);
        }
        oal oalVar = nznVar.p;
        Context A = navHostFragment.A();
        fr I = navHostFragment.I();
        I.getClass();
        oalVar.c(new oax(A, I));
        oal oalVar2 = nznVar.p;
        Context A2 = navHostFragment.A();
        fr I2 = navHostFragment.I();
        I2.getClass();
        oalVar2.c(new obl(A2, I2, navHostFragment.a()));
        Bundle a = navHostFragment.U().a("android-support-nav:fragment:navControllerState");
        if (a != null) {
            a.setClassLoader(nznVar.a.getClassLoader());
            if (!a.containsKey("android-support-nav:controller:navigatorState")) {
                bundle = null;
            } else {
                if (!a.containsKey("android-support-nav:controller:navigatorState")) {
                    throw new IllegalArgumentException("No saved state was found associated with the key 'android-support-nav:controller:navigatorState'.");
                }
                bundle = a.getBundle("android-support-nav:controller:navigatorState");
                if (bundle == null) {
                    throw new IllegalStateException("The saved state value associated with the key 'android-support-nav:controller:navigatorState' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly.");
                }
            }
            nznVar.c = bundle;
            if (!a.containsKey("android-support-nav:controller:backStack")) {
                parcelableArr = null;
            } else {
                if (!a.containsKey("android-support-nav:controller:backStack")) {
                    throw new IllegalArgumentException("No saved state was found associated with the key 'android-support-nav:controller:backStack'.");
                }
                ArrayList b = ih.b(a, "android-support-nav:controller:backStack", Parcelable.class);
                if (b == null) {
                    throw new IllegalStateException("The saved state value associated with the key 'android-support-nav:controller:backStack' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly.");
                }
                parcelableArr = (Parcelable[]) b.toArray(new Parcelable[0]);
            }
            nznVar.d = parcelableArr;
            nznVar.j.clear();
            if (a.containsKey("android-support-nav:controller:backStackDestIds") && a.containsKey("android-support-nav:controller:backStackIds")) {
                if (!a.containsKey("android-support-nav:controller:backStackDestIds")) {
                    throw new IllegalArgumentException("No saved state was found associated with the key 'android-support-nav:controller:backStackDestIds'.");
                }
                int[] intArray = a.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray == null) {
                    throw new IllegalStateException("The saved state value associated with the key 'android-support-nav:controller:backStackDestIds' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly.");
                }
                if (!a.containsKey("android-support-nav:controller:backStackIds")) {
                    throw new IllegalArgumentException("No saved state was found associated with the key 'android-support-nav:controller:backStackIds'.");
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("android-support-nav:controller:backStackIds");
                if (stringArrayList == null) {
                    throw new IllegalStateException("The saved state value associated with the key 'android-support-nav:controller:backStackIds' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly.");
                }
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    nznVar.i.put(Integer.valueOf(intArray[i]), !ffkj.e(stringArrayList.get(i2), "") ? stringArrayList.get(i2) : null);
                    i++;
                    i2 = i3;
                }
            }
            if (a.containsKey("android-support-nav:controller:backStackStates")) {
                if (!a.containsKey("android-support-nav:controller:backStackStates")) {
                    throw new IllegalArgumentException("No saved state was found associated with the key 'android-support-nav:controller:backStackStates'.");
                }
                ArrayList<String> stringArrayList2 = a.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 == null) {
                    throw new IllegalStateException("The saved state value associated with the key 'android-support-nav:controller:backStackStates' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly.");
                }
                for (String str : stringArrayList2) {
                    if (a.containsKey("android-support-nav:controller:backStackStates:".concat(String.valueOf(str)))) {
                        String concat = "android-support-nav:controller:backStackStates:".concat(String.valueOf(str));
                        if (!a.containsKey(concat)) {
                            throw new IllegalArgumentException(a.a(concat, "No saved state was found associated with the key '", "'."));
                        }
                        ArrayList<Parcelable> b2 = ih.b(a, concat, Parcelable.class);
                        if (b2 == null) {
                            throw new IllegalStateException(a.a(concat, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
                        }
                        Map map = nznVar.j;
                        ffdn ffdnVar = new ffdn(b2.size());
                        for (Parcelable parcelable : b2) {
                            parcelable.getClass();
                            ffdnVar.add((nxo) parcelable);
                        }
                        map.put(str, ffdnVar);
                    }
                }
            }
            a.containsKey("android-support-nav:controller:deepLinkHandled");
            nznVar.e = a.getBoolean("android-support-nav:controller:deepLinkHandled", false);
        }
        navHostFragment.U().b("android-support-nav:fragment:navControllerState", new owu() { // from class: obm
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle2;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle a2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
                nzn nznVar2 = nzn.this;
                for (Map.Entry entry : nznVar2.p.b().entrySet()) {
                    String str2 = (String) entry.getKey();
                    Bundle e = ((oaj) entry.getValue()).e();
                    if (e != null) {
                        arrayList.add(str2);
                        a2.putBundle(str2, e);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle2 = null;
                } else {
                    bundle2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
                    a2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle2.putBundle("android-support-nav:controller:navigatorState", a2);
                }
                if (!nznVar2.f.isEmpty()) {
                    if (bundle2 == null) {
                        bundle2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it = nznVar2.f.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new nxo((nxm) it.next()));
                    }
                    bundle2.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!nznVar2.i.isEmpty()) {
                    if (bundle2 == null) {
                        bundle2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
                    }
                    int[] iArr = new int[nznVar2.i.size()];
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    int i4 = 0;
                    for (Map.Entry entry2 : nznVar2.i.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i5 = i4 + 1;
                        iArr[i4] = intValue;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i4 = i5;
                    }
                    bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!nznVar2.j.isEmpty()) {
                    if (bundle2 == null) {
                        bundle2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
                    }
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    for (Map.Entry entry3 : nznVar2.j.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        ffdn ffdnVar2 = (ffdn) entry3.getValue();
                        arrayList4.add(str4);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator<E> it2 = ffdnVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add((nxo) it2.next());
                        }
                        bundle2.putParcelableArrayList("android-support-nav:controller:backStackStates:".concat(String.valueOf(str4)), arrayList5);
                    }
                    bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList4);
                }
                if (nznVar2.e) {
                    if (bundle2 == null) {
                        bundle2 = kqr.a((ffcf[]) Arrays.copyOf(new ffcf[0], 0));
                    }
                    bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", nznVar2.e);
                }
                if (bundle2 != null) {
                    return bundle2;
                }
                Bundle bundle3 = Bundle.EMPTY;
                bundle3.getClass();
                return bundle3;
            }
        });
        Bundle a2 = navHostFragment.U().a("android-support-nav:fragment:graphId");
        if (a2 != null) {
            navHostFragment.a = a2.getInt("android-support-nav:fragment:graphId");
        }
        navHostFragment.U().b("android-support-nav:fragment:graphId", new owu() { // from class: obn
            @Override // defpackage.owu
            public final Bundle a() {
                int i4 = NavHostFragment.this.a;
                if (i4 != 0) {
                    return kqr.a(new ffcf("android-support-nav:fragment:graphId", Integer.valueOf(i4)));
                }
                Bundle bundle2 = Bundle.EMPTY;
                bundle2.getClass();
                return bundle2;
            }
        });
        int i4 = navHostFragment.a;
        if (i4 != 0) {
            nznVar.l(i4);
            return nznVar;
        }
        Bundle bundle2 = navHostFragment.m;
        int i5 = bundle2 != null ? bundle2.getInt("android-support-nav:fragment:graphId") : 0;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
        if (i5 != 0) {
            nznVar.m(nznVar.g().a(i5), bundle3);
        }
        return nznVar;
    }
}
