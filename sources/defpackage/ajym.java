package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajym extends ffhv implements ffjm {
    final /* synthetic */ ajyr a;
    final /* synthetic */ UUID b;
    final /* synthetic */ int c;
    final /* synthetic */ String d = "metadata";
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajym(ffgu ffguVar, ajyr ajyrVar, UUID uuid, int i) {
        super(2, ffguVar);
        this.a = ajyrVar;
        this.b = uuid;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajym) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        Iterable iterable;
        ffci.b(obj);
        File c = this.a.c(this.b);
        String[] list2 = c.list(new ajyn());
        if (list2 != null) {
            int i = this.c;
            if (i < 0) {
                throw new IllegalArgumentException(a.f(i, "Requested element count ", " is less than zero."));
            }
            if (i == 0) {
                iterable = ffel.a;
            } else {
                if (i >= list2.length) {
                    iterable = ffdo.L(list2);
                } else {
                    if (i == 1) {
                        iterable = ffdx.g(list2[0]);
                    } else {
                        ArrayList arrayList = new ArrayList(i);
                        int i2 = 0;
                        for (String str : list2) {
                            arrayList.add(str);
                            i2++;
                            if (i2 == i) {
                                break;
                            }
                        }
                        iterable = arrayList;
                    }
                }
            }
            list = ffdx.ak(iterable);
        } else {
            list = ffel.a;
        }
        if (list.isEmpty()) {
            ((ensz) ajyr.a.h()).D("Zero files with suffix [%s] found for session id [%s]", this.d, this.b);
            return engq.a(ffel.a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = new File(c, (String) it.next());
            akcg akcgVar = null;
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    akcg akcgVar2 = (akcg) eyfy.parseFrom(akcg.a, ffif.a(fileInputStream));
                    ffig.a(fileInputStream, null);
                    akcgVar = akcgVar2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (FileNotFoundException unused) {
                ((ensz) ajyr.a.j()).t("Could not find metadata file [%s]", file.getAbsolutePath());
            } catch (IOException e) {
                ((ensz) ((ensz) ajyr.a.j()).g(e)).t("Error reading metadata file [%s]", file.getAbsolutePath());
            }
            if (akcgVar != null) {
                arrayList2.add(akcgVar);
            }
        }
        return engq.a(arrayList2);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajym ajymVar = new ajym(ffguVar, this.a, this.b, this.c);
        ajymVar.e = obj;
        return ajymVar;
    }
}
