package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eksb implements eewm {
    public final ffbr a;
    private final eewk b;
    private final eewk c;
    private final eewk d;
    private final List e;

    public eksb(ffbr ffbrVar) {
        ekry ekryVar = new ekry(this);
        this.b = ekryVar;
        ekrz ekrzVar = new ekrz(this);
        this.c = ekrzVar;
        eksa eksaVar = new eksa(this);
        this.d = eksaVar;
        this.e = Arrays.asList(ekryVar, ekrzVar, eksaVar);
        this.a = ffbrVar;
    }

    public final Map a(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        try {
            Map map = (Map) ersn.a(((ektp) this.a.b()).c());
            cmh cmhVar = new cmh();
            for (Map.Entry entry : map.entrySet()) {
                ektu ektuVar = (ektu) entry.getKey();
                if (hashSet.isEmpty() || hashSet.contains(ektuVar.b.b())) {
                    cmhVar.put((ektu) entry.getKey(), (Long) entry.getValue());
                }
            }
            return cmhVar;
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public final String[] b(String[] strArr) {
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        try {
            for (ektu ektuVar : ((Map) ersn.a(((ektp) this.a.b()).c())).keySet()) {
                if (!hashSet.contains(ektuVar.b.b())) {
                    treeSet.add(ektuVar.b.b());
                }
            }
            return (String[]) treeSet.toArray(new String[treeSet.size()]);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.eewm
    public final String c() {
        return "sync";
    }

    @Override // defpackage.eewm
    public final List d() {
        return this.e;
    }

    @Override // defpackage.eewm
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}
