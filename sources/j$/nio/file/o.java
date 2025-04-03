package j$.nio.file;

import j$.nio.file.attribute.C0004a;
import j$.nio.file.attribute.C0012i;
import j$.nio.file.attribute.InterfaceC0008e;
import j$.nio.file.attribute.InterfaceC0011h;
import j$.util.C0042f;
import java.nio.file.LinkOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class o {
    public static final G a = new D(Object.class, "OVERFLOW");
    public static final G b = new D(Path.class, "ENTRY_CREATE");
    public static final G c = new D(Path.class, "ENTRY_DELETE");
    public static final G d = new D(Path.class, "ENTRY_MODIFY");

    public static Iterator a(j$.desugar.sun.nio.fs.o oVar) {
        return new p(oVar);
    }

    public static /* synthetic */ StandardOpenOption b(C c2) {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        StandardOpenOption standardOpenOption4;
        StandardOpenOption standardOpenOption5;
        StandardOpenOption standardOpenOption6;
        StandardOpenOption standardOpenOption7;
        StandardOpenOption standardOpenOption8;
        StandardOpenOption standardOpenOption9;
        StandardOpenOption standardOpenOption10;
        if (c2 == null) {
            return null;
        }
        if (c2 == C.READ) {
            standardOpenOption10 = StandardOpenOption.READ;
            return standardOpenOption10;
        }
        if (c2 == C.WRITE) {
            standardOpenOption9 = StandardOpenOption.WRITE;
            return standardOpenOption9;
        }
        if (c2 == C.APPEND) {
            standardOpenOption8 = StandardOpenOption.APPEND;
            return standardOpenOption8;
        }
        if (c2 == C.TRUNCATE_EXISTING) {
            standardOpenOption7 = StandardOpenOption.TRUNCATE_EXISTING;
            return standardOpenOption7;
        }
        if (c2 == C.CREATE) {
            standardOpenOption6 = StandardOpenOption.CREATE;
            return standardOpenOption6;
        }
        if (c2 == C.CREATE_NEW) {
            standardOpenOption5 = StandardOpenOption.CREATE_NEW;
            return standardOpenOption5;
        }
        if (c2 == C.DELETE_ON_CLOSE) {
            standardOpenOption4 = StandardOpenOption.DELETE_ON_CLOSE;
            return standardOpenOption4;
        }
        if (c2 == C.SPARSE) {
            standardOpenOption3 = StandardOpenOption.SPARSE;
            return standardOpenOption3;
        }
        if (c2 == C.SYNC) {
            standardOpenOption2 = StandardOpenOption.SYNC;
            return standardOpenOption2;
        }
        standardOpenOption = StandardOpenOption.DSYNC;
        return standardOpenOption;
    }

    public static Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Path ? t.o((Path) obj) : r.m(obj) ? s.o(r.d(obj)) : obj;
    }

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.y()) {
            return InterfaceC0008e.class;
        }
        if (cls == InterfaceC0008e.class) {
            return j$.adapter.b.y();
        }
        if (cls == j$.adapter.b.A()) {
            return j$.nio.file.attribute.A.class;
        }
        if (cls == j$.nio.file.attribute.A.class) {
            return j$.adapter.b.A();
        }
        if (cls == j$.adapter.b.B()) {
            return j$.nio.file.attribute.w.class;
        }
        if (cls == j$.nio.file.attribute.w.class) {
            return j$.adapter.b.B();
        }
        if (cls == C0012i.class) {
            return j$.adapter.b.C();
        }
        if (cls == j$.adapter.b.C()) {
            return C0012i.class;
        }
        if (cls == j$.nio.file.attribute.D.class) {
            return j$.adapter.b.D();
        }
        if (cls == j$.adapter.b.D()) {
            return j$.nio.file.attribute.D.class;
        }
        if (cls == C0004a.class) {
            return j$.adapter.b.z();
        }
        if (cls == j$.adapter.b.z()) {
            return C0004a.class;
        }
        C0042f.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Class e(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == j$.adapter.b.a()) {
            return InterfaceC0011h.class;
        }
        if (cls == InterfaceC0011h.class) {
            return j$.adapter.b.a();
        }
        if (cls == j$.adapter.b.r()) {
            return j$.nio.file.attribute.B.class;
        }
        if (cls == j$.nio.file.attribute.B.class) {
            return j$.adapter.b.r();
        }
        if (cls == j$.nio.file.attribute.j.class) {
            return j$.adapter.b.v();
        }
        if (cls == j$.adapter.b.v()) {
            return j$.nio.file.attribute.j.class;
        }
        C0042f.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static Map f(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, g(map.get(str)));
        }
        return hashMap;
    }

    public static Object g(Object obj) {
        if (j$.adapter.b.p(obj)) {
            try {
                return j$.nio.file.attribute.p.b(j$.adapter.b.i(obj));
            } catch (ClassCastException e) {
                C0042f.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.y)) {
            return obj;
        }
        try {
            return j$.nio.file.attribute.p.d((j$.nio.file.attribute.y) obj);
        } catch (ClassCastException e2) {
            C0042f.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Set h(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof n) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(m.a((n) it.next()));
                } catch (ClassCastException e) {
                    C0042f.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.x(next)) {
                C0042f.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(l.a(j$.adapter.b.e(it2.next())));
                } catch (ClassCastException e2) {
                    C0042f.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Set i(Set set) {
        PosixFilePermission posixFilePermission;
        PosixFilePermission posixFilePermission2;
        PosixFilePermission posixFilePermission3;
        PosixFilePermission posixFilePermission4;
        PosixFilePermission posixFilePermission5;
        PosixFilePermission posixFilePermission6;
        PosixFilePermission posixFilePermission7;
        PosixFilePermission posixFilePermission8;
        j$.nio.file.attribute.C c2;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.C) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.C c3 = (j$.nio.file.attribute.C) it.next();
                    hashSet.add(c3 == null ? null : c3 == j$.nio.file.attribute.C.OWNER_READ ? PosixFilePermission.OWNER_READ : c3 == j$.nio.file.attribute.C.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : c3 == j$.nio.file.attribute.C.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : c3 == j$.nio.file.attribute.C.GROUP_READ ? PosixFilePermission.GROUP_READ : c3 == j$.nio.file.attribute.C.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : c3 == j$.nio.file.attribute.C.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : c3 == j$.nio.file.attribute.C.OTHERS_READ ? PosixFilePermission.OTHERS_READ : c3 == j$.nio.file.attribute.C.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    C0042f.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!j$.adapter.b.t(next)) {
                C0042f.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission j = j$.adapter.b.j(it2.next());
                    if (j == null) {
                        c2 = null;
                    } else {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                        if (j == posixFilePermission) {
                            c2 = j$.nio.file.attribute.C.OWNER_READ;
                        } else {
                            posixFilePermission2 = PosixFilePermission.OWNER_WRITE;
                            if (j == posixFilePermission2) {
                                c2 = j$.nio.file.attribute.C.OWNER_WRITE;
                            } else {
                                posixFilePermission3 = PosixFilePermission.OWNER_EXECUTE;
                                if (j == posixFilePermission3) {
                                    c2 = j$.nio.file.attribute.C.OWNER_EXECUTE;
                                } else {
                                    posixFilePermission4 = PosixFilePermission.GROUP_READ;
                                    if (j == posixFilePermission4) {
                                        c2 = j$.nio.file.attribute.C.GROUP_READ;
                                    } else {
                                        posixFilePermission5 = PosixFilePermission.GROUP_WRITE;
                                        if (j == posixFilePermission5) {
                                            c2 = j$.nio.file.attribute.C.GROUP_WRITE;
                                        } else {
                                            posixFilePermission6 = PosixFilePermission.GROUP_EXECUTE;
                                            if (j == posixFilePermission6) {
                                                c2 = j$.nio.file.attribute.C.GROUP_EXECUTE;
                                            } else {
                                                posixFilePermission7 = PosixFilePermission.OTHERS_READ;
                                                if (j == posixFilePermission7) {
                                                    c2 = j$.nio.file.attribute.C.OTHERS_READ;
                                                } else {
                                                    posixFilePermission8 = PosixFilePermission.OTHERS_WRITE;
                                                    c2 = j == posixFilePermission8 ? j$.nio.file.attribute.C.OTHERS_WRITE : j$.nio.file.attribute.C.OTHERS_EXECUTE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hashSet.add(c2);
                } catch (ClassCastException e2) {
                    C0042f.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static /* synthetic */ k[] j(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        k[] kVarArr = new k[length];
        for (int i = 0; i < length; i++) {
            kVarArr[i] = linkOptionArr[i] == null ? null : k.NOFOLLOW_LINKS;
        }
        return kVarArr;
    }

    public static G[] k(WatchEvent.Kind[] kindArr) {
        WatchEvent.Kind kind;
        WatchEvent.Kind kind2;
        WatchEvent.Kind kind3;
        WatchEvent.Kind kind4;
        G a2;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        G[] gArr = new G[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind5 = kindArr[i];
            if (kind5 == null) {
                a2 = null;
            } else {
                kind = StandardWatchEventKinds.ENTRY_CREATE;
                if (kind5 == kind) {
                    a2 = b;
                } else {
                    kind2 = StandardWatchEventKinds.ENTRY_DELETE;
                    if (kind5 == kind2) {
                        a2 = c;
                    } else {
                        kind3 = StandardWatchEventKinds.ENTRY_MODIFY;
                        if (kind5 == kind3) {
                            a2 = d;
                        } else {
                            kind4 = StandardWatchEventKinds.OVERFLOW;
                            a2 = kind5 == kind4 ? a : E.a(kind5);
                        }
                    }
                }
            }
            gArr[i] = a2;
        }
        return gArr;
    }

    public static /* synthetic */ LinkOption[] l(k[] kVarArr) {
        if (kVarArr == null) {
            return null;
        }
        int length = kVarArr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = kVarArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr;
    }

    public static WatchEvent.Kind[] m(G[] gArr) {
        if (gArr == null) {
            return null;
        }
        int length = gArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            G g = gArr[i];
            kindArr[i] = g == null ? null : g == b ? StandardWatchEventKinds.ENTRY_CREATE : g == c ? StandardWatchEventKinds.ENTRY_DELETE : g == d ? StandardWatchEventKinds.ENTRY_MODIFY : g == a ? StandardWatchEventKinds.OVERFLOW : F.a(g);
        }
        return kindArr;
    }
}
