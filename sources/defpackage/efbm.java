package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbm {
    public final Map a;
    public final Map b;
    public final List c;

    public efbm(List list) {
        this(list, Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    private static final Uri k(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final efbh l(Uri uri) {
        engw n = n(uri);
        efbg efbgVar = new efbg();
        efbgVar.a = this;
        efbgVar.b = m(uri.getScheme());
        efbgVar.d = this.c;
        efbgVar.c = n;
        efbgVar.e = uri;
        if (!n.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = n.listIterator(n.size());
                while (listIterator.hasPrevious()) {
                    ((efel) listIterator.previous()).f();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        efbgVar.f = uri;
        return new efbh(efbgVar);
    }

    private final efef m(String str) {
        efef efefVar = (efef) this.a.get(str);
        if (efefVar != null) {
            return efefVar;
        }
        throw new efcy(String.format("Requested backend isn't registered: %s", str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final engw n(Uri uri) {
        int i = engw.d;
        engr engrVar = new engr();
        Pattern pattern = efdg.a;
        engr engrVar2 = new engr();
        String encodedFragment = uri.getEncodedFragment();
        engw j = (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) ? enou.a : engw.j(emye.d("+").a().g(encodedFragment.substring(10)));
        int size = j.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) j.get(i2);
            Matcher matcher = efdg.a.matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
            engrVar2.h(matcher.group(1));
        }
        engw g = engrVar2.g();
        int i3 = ((enou) g).c;
        for (int i4 = 0; i4 < i3; i4++) {
            String str2 = (String) g.get(i4);
            efel efelVar = (efel) this.b.get(str2);
            if (efelVar == null) {
                throw new efcy("Requested transform isn't registered: " + str2 + ": " + String.valueOf(uri));
            }
            engrVar.h(efelVar);
        }
        return engrVar.g().a();
    }

    public final long a(Uri uri) {
        efbh l = l(uri);
        return l.b.a(l.f);
    }

    public final Iterable b(Uri uri) {
        efef m = m(uri.getScheme());
        engw n = n(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        Iterator it = m.h(k(uri)).iterator();
        while (it.hasNext()) {
            Uri build = ((Uri) it.next()).buildUpon().encodedFragment(encodedFragment).build();
            if (!n.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) enjk.j(arrayList2);
                    Iterator<E> it2 = n.iterator();
                    while (it2.hasNext()) {
                        ((efel) it2.next()).e();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    public final Object c(Uri uri, efbi efbiVar) {
        return efbiVar.a(l(uri));
    }

    public final void d(Uri uri) {
        m(uri.getScheme()).j(k(uri));
    }

    public final void e(Uri uri) {
        m(uri.getScheme()).k(k(uri));
    }

    public final void f(Uri uri) {
        efbh l = l(uri);
        l.b.l(l.f);
    }

    public final void g(Uri uri, Uri uri2) {
        efbh l = l(uri);
        efef efefVar = l.b;
        efbh l2 = l(uri2);
        if (efefVar != l2.b) {
            throw new efcy("Cannot rename file across backends");
        }
        l.b.m(l.f, l2.f);
    }

    public final boolean h(Uri uri) {
        efbh l = l(uri);
        return l.b.n(l.f);
    }

    public final boolean i(Uri uri) {
        return m(uri.getScheme()).o(k(uri));
    }

    @Deprecated
    public final void j(Uri uri) {
        if (h(uri)) {
            if (!i(uri)) {
                f(uri);
                return;
            }
            Iterator it = b(uri).iterator();
            while (it.hasNext()) {
                j((Uri) it.next());
            }
            e(uri);
        }
    }

    public efbm(List list, List list2, List list3) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            efef efefVar = (efef) it.next();
            if (TextUtils.isEmpty(efefVar.i())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                efef efefVar2 = (efef) this.a.put(efefVar.i(), efefVar);
                if (efefVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + efefVar2.getClass().getCanonicalName() + " with " + efefVar.getClass().getCanonicalName());
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            efel efelVar = (efel) it2.next();
            if (TextUtils.isEmpty(efelVar.c())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                efel efelVar2 = (efel) this.b.put(efelVar.c(), efelVar);
                if (efelVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + efelVar2.getClass().getCanonicalName() + " with " + efelVar.getClass().getCanonicalName());
                }
            }
        }
        this.c.addAll(list3);
    }
}
