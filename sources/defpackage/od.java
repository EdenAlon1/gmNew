package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class od implements kqm {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public ob b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public og j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private final boolean o;
    private final ArrayList p;
    private boolean q;
    private final ArrayList r;
    private boolean s;
    private int t = 0;
    public boolean h = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private final ArrayList x = new ArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    private boolean y = false;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        if (r6.getBoolean(r1) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (r6 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public od(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.t = r0
            r5.h = r0
            r5.u = r0
            r5.v = r0
            r5.w = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.x = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.i = r1
            r5.y = r0
            r5.a = r6
            android.content.res.Resources r1 = r6.getResources()
            r5.m = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.p = r2
            r2 = 1
            r5.q = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.d = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.r = r3
            r5.s = r2
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.keyboard
            if (r1 == r2) goto L76
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r6)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L61
            boolean r6 = defpackage.od$$ExternalSyntheticApiModelOutline0.m(r1)
            if (r6 == 0) goto L76
        L5f:
            r0 = r2
            goto L76
        L61:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r1 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r3 = "bool"
            int r1 = defpackage.kvr.b(r6, r1, r3)
            if (r1 == 0) goto L76
            boolean r6 = r6.getBoolean(r1)
            if (r6 == 0) goto L76
            goto L5f
        L76:
            r5.o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od.<init>(android.content.Context):void");
    }

    private final void E(int i, boolean z) {
        if (i < 0 || i >= this.c.size()) {
            return;
        }
        this.c.remove(i);
        if (z) {
            l(true);
        }
    }

    public final boolean A(MenuItem menuItem, oq oqVar, int i) {
        boolean h;
        og ogVar = (og) menuItem;
        if (ogVar != null && ogVar.isEnabled()) {
            boolean n = ogVar.n();
            kte kteVar = ogVar.p;
            boolean z = kteVar != null && kteVar.hasSubMenu();
            if (ogVar.m()) {
                boolean expandActionView = ogVar.expandActionView() | n;
                if (!expandActionView) {
                    return expandActionView;
                }
                i(true);
                return true;
            }
            if (!ogVar.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return n;
                }
                i(true);
                return n;
            }
            if ((i & 4) == 0) {
                i(false);
            }
            if (!ogVar.hasSubMenu()) {
                ogVar.l(new oy(this.a, this, ogVar));
            }
            oy oyVar = ogVar.l;
            if (z) {
                kteVar.onPrepareSubMenu(oyVar);
            }
            if (this.i.isEmpty()) {
                h = false;
            } else {
                h = oqVar != null ? oqVar.h(oyVar) : false;
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    oq oqVar2 = (oq) weakReference.get();
                    if (oqVar2 == null) {
                        this.i.remove(weakReference);
                    } else if (!h) {
                        h = oqVar2.h(oyVar);
                    }
                }
            }
            boolean z2 = n | h;
            if (z2) {
                return z2;
            }
            i(true);
        }
        return false;
    }

    final void B() {
        this.s = true;
        l(true);
    }

    final void C() {
        this.q = true;
        l(true);
    }

    public final void D() {
        this.t = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem c = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c.setIcon(resolveInfo.loadIcon(packageManager));
            ((og) c).f = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = c;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    final og b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.x;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (og) arrayList.get(0);
        }
        boolean x = x();
        for (int i2 = 0; i2 < size; i2++) {
            og ogVar = (og) arrayList.get(i2);
            char c = x ? ogVar.i : ogVar.g;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (x && c == '\b' && i == 67))) {
                return ogVar;
            }
        }
        return null;
    }

    protected MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (l[i5] << 16) | ((char) i3);
        og ogVar = new og(this, i, i2, i3, i6, charSequence, this.t);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((og) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, ogVar);
        l(true);
        return ogVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        og ogVar = this.j;
        if (ogVar != null) {
            t(ogVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.r;
    }

    public final ArrayList f() {
        if (!this.q) {
            return this.p;
        }
        this.p.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            og ogVar = (og) this.c.get(i);
            if (ogVar.isVisible()) {
                this.p.add(ogVar);
            }
        }
        this.q = false;
        this.s = true;
        return this.p;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            og ogVar = (og) this.c.get(i2);
            if (ogVar.a == i) {
                return ogVar;
            }
            if (ogVar.hasSubMenu() && (findItem = ogVar.l.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final void g(oq oqVar) {
        h(oqVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(oq oqVar, Context context) {
        this.i.add(new WeakReference(oqVar));
        oqVar.c(context, this);
        this.s = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((og) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.w) {
            return;
        }
        this.w = true;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oq oqVar = (oq) weakReference.get();
            if (oqVar == null) {
                this.i.remove(weakReference);
            } else {
                oqVar.d(this, z);
            }
        }
        this.w = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        boolean x = x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i != 67) {
                return;
            } else {
                i = 67;
            }
        }
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            og ogVar = (og) this.c.get(i2);
            if (ogVar.hasSubMenu()) {
                ogVar.l.j(list, i, keyEvent);
            }
            char c = x ? ogVar.i : ogVar.g;
            if ((modifiers & 69647) == ((x ? ogVar.j : ogVar.h) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (x && c == '\b' && i == 67)) && ogVar.isEnabled())) {
                list.add(ogVar);
            }
        }
    }

    public final void k() {
        ArrayList f = f();
        if (this.s) {
            Iterator it = this.i.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oq oqVar = (oq) weakReference.get();
                if (oqVar == null) {
                    this.i.remove(weakReference);
                } else {
                    z |= oqVar.g();
                }
            }
            if (z) {
                this.d.clear();
                this.r.clear();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    og ogVar = (og) f.get(i);
                    if (ogVar.o()) {
                        this.d.add(ogVar);
                    } else {
                        this.r.add(ogVar);
                    }
                }
            } else {
                this.d.clear();
                this.r.clear();
                this.r.addAll(f());
            }
            this.s = false;
        }
    }

    public final void l(boolean z) {
        boolean z2 = true;
        if (this.h) {
            this.u = true;
            if (z) {
                this.v = true;
                return;
            }
            return;
        }
        if (z) {
            this.q = true;
            this.s = true;
        } else {
            z2 = false;
        }
        if (this.i.isEmpty()) {
            return;
        }
        s();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oq oqVar = (oq) weakReference.get();
            if (oqVar == null) {
                this.i.remove(weakReference);
            } else {
                oqVar.f(z2);
            }
        }
        r();
    }

    public final void m(oq oqVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oq oqVar2 = (oq) weakReference.get();
            if (oqVar2 == null || oqVar2 == oqVar) {
                this.i.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
        MenuItem findItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((oy) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void o(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((oy) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(ob obVar) {
        this.b = obVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        og b = b(i, keyEvent);
        boolean z = b != null ? z(b, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.m.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.u) {
            this.u = false;
            l(this.v);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((og) this.c.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((og) this.c.get(i2)).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((og) this.c.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.u = false;
        this.v = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            og ogVar = (og) this.c.get(i2);
            if (ogVar.b == i) {
                ogVar.j(z2);
                ogVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            og ogVar = (og) this.c.get(i2);
            if (ogVar.b == i) {
                ogVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            og ogVar = (og) this.c.get(i2);
            if (ogVar.b == i && ogVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(og ogVar) {
        boolean z = false;
        if (!this.i.isEmpty() && this.j == ogVar) {
            s();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oq oqVar = (oq) weakReference.get();
                if (oqVar == null) {
                    this.i.remove(weakReference);
                } else {
                    z = oqVar.i(ogVar);
                    if (z) {
                        break;
                    }
                }
            }
            r();
            if (z) {
                this.j = null;
            }
        }
        return z;
    }

    public boolean u(od odVar, MenuItem menuItem) {
        ob obVar = this.b;
        return obVar != null && obVar.L(odVar, menuItem);
    }

    public boolean v(og ogVar) {
        boolean z = false;
        if (this.i.isEmpty()) {
            return false;
        }
        s();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oq oqVar = (oq) weakReference.get();
            if (oqVar == null) {
                this.i.remove(weakReference);
            } else {
                z = oqVar.j(ogVar);
                if (z) {
                    break;
                }
            }
        }
        r();
        if (z) {
            this.j = ogVar;
        }
        return z;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.n;
    }

    public boolean y() {
        return this.o;
    }

    public final boolean z(MenuItem menuItem, int i) {
        return A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        og ogVar = (og) c(i, i2, i3, charSequence);
        oy oyVar = new oy(this.a, this, ogVar);
        ogVar.l(oyVar);
        return oyVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public od a() {
        return this;
    }
}
