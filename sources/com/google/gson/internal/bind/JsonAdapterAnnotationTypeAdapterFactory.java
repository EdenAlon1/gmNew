package com.google.gson.internal.bind;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import defpackage.evkn;
import defpackage.evks;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evli;
import defpackage.evmi;
import defpackage.evpj;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements evlg {
    public static final evlg a = new DummyTypeAdapterFactory();
    private static final evlg d = new DummyTypeAdapterFactory();
    public final evmi b;
    public final ConcurrentMap c = new ConcurrentHashMap();

    /* compiled from: PG */
    private static class DummyTypeAdapterFactory implements evlg {
        @Override // defpackage.evlg
        public final evlf a(evkn evknVar, evpj evpjVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    public JsonAdapterAnnotationTypeAdapterFactory(evmi evmiVar) {
        this.b = evmiVar;
    }

    public static evli d(Class cls) {
        return (evli) cls.getAnnotation(evli.class);
    }

    public static Object e(evmi evmiVar, Class cls) {
        return evmiVar.a(new evpj(cls)).a();
    }

    @Override // defpackage.evlg
    public final evlf a(evkn evknVar, evpj evpjVar) {
        evli d2 = d(evpjVar.a);
        if (d2 == null) {
            return null;
        }
        return b(this.b, evknVar, evpjVar, d2, true);
    }

    final evlf b(evmi evmiVar, evkn evknVar, evpj evpjVar, evli evliVar, boolean z) {
        ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1;
        evlf evlfVar;
        Object e = e(evmiVar, evliVar.a());
        boolean z2 = e instanceof evlf;
        boolean b = evliVar.b();
        if (z2) {
            evlfVar = (evlf) e;
        } else if (e instanceof evlg) {
            evlg evlgVar = (evlg) e;
            if (z) {
                evlgVar = c(evpjVar.a, evlgVar);
            }
            evlfVar = evlgVar.a(evknVar, evpjVar);
        } else {
            if (e instanceof ConversationSuggestionResponseSerializer.AnonymousClass1) {
                anonymousClass1 = (ConversationSuggestionResponseSerializer.AnonymousClass1) e;
            } else {
                if (!(e instanceof evks)) {
                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + e.getClass().getName() + " as a @JsonAdapter for " + evpjVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                }
                anonymousClass1 = null;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(anonymousClass1, e instanceof evks ? (evks) e : null, evknVar, evpjVar, z ? a : d, b);
            b = false;
            evlfVar = treeTypeAdapter;
        }
        return (evlfVar == null || !b) ? evlfVar : evlfVar.d();
    }

    public final evlg c(Class cls, evlg evlgVar) {
        evlg evlgVar2 = (evlg) this.c.putIfAbsent(cls, evlgVar);
        return evlgVar2 != null ? evlgVar2 : evlgVar;
    }
}
