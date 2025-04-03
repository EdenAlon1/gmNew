package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import defpackage.evkn;
import defpackage.evlf;
import defpackage.evpj;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evko {
    private final evkh f;
    private final ArrayDeque g;
    private final int h;
    private final int i;
    private Excluder c = Excluder.a;
    public int b = 1;
    private final Map d = new HashMap();
    public final List a = new ArrayList();
    private final List e = new ArrayList();

    public evko() {
        int i = evkn.g;
        this.f = evkn.a;
        this.h = evkn.e;
        this.i = evkn.f;
        this.g = new ArrayDeque();
    }

    public final evkn a() {
        ArrayList arrayList = new ArrayList(this.a.size() + this.e.size() + 3);
        arrayList.addAll(this.a);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.e);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        boolean z = evpi.a;
        Excluder excluder = this.c;
        int i = this.b;
        HashMap hashMap = new HashMap(this.d);
        new ArrayList(this.a);
        new ArrayList(this.e);
        ArrayList arrayList3 = new ArrayList(this.g);
        return new evkn(excluder, i, hashMap, this.f, arrayList, this.h, this.i, arrayList3);
    }

    public final void b() {
        Excluder clone = this.c.clone();
        clone.d = true;
        this.c = clone;
    }

    public final void c(Type type, Object obj) {
        boolean z = obj instanceof ConversationSuggestionResponseSerializer.AnonymousClass1;
        evlk.a(z || (obj instanceof evks) || (obj instanceof evkp) || (obj instanceof evlf));
        if (type == Object.class) {
            throw new IllegalArgumentException("Cannot override built-in adapter for ".concat(type.toString()));
        }
        if (obj instanceof evkp) {
            this.d.put(type, (evkp) obj);
        }
        if (z || (obj instanceof evks)) {
            evpj evpjVar = new evpj(type);
            this.a.add(new TreeTypeAdapter.SingleTypeFactory(obj, evpjVar, evpjVar.b == evpjVar.a));
        }
        if (obj instanceof evlf) {
            final evpj evpjVar2 = new evpj(type);
            final evlf evlfVar = (evlf) obj;
            this.a.add(new evlg() { // from class: com.google.gson.internal.bind.TypeAdapters$28
                @Override // defpackage.evlg
                public final evlf a(evkn evknVar, evpj evpjVar3) {
                    if (evpjVar3.equals(evpj.this)) {
                        return evlfVar;
                    }
                    return null;
                }
            });
        }
    }
}
