package com.google.gson.internal.bind;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import defpackage.evkn;
import defpackage.evks;
import defpackage.evkt;
import defpackage.evkv;
import defpackage.evlf;
import defpackage.evlg;
import defpackage.evlk;
import defpackage.evnc;
import defpackage.evnx;
import defpackage.evny;
import defpackage.evpj;
import defpackage.evpl;
import defpackage.evpn;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TreeTypeAdapter extends evnx {
    final evkn a;
    private final evks b;
    private final evpj c;
    private final evlg d;
    private final evny e = new evny();
    private final boolean f;
    private volatile evlf g;
    private final ConversationSuggestionResponseSerializer.AnonymousClass1 h;

    /* compiled from: PG */
    public static final class SingleTypeFactory implements evlg {
        private final evpj a;
        private final boolean b;
        private final evks c;
        private final ConversationSuggestionResponseSerializer.AnonymousClass1 d;

        public SingleTypeFactory(Object obj, evpj evpjVar, boolean z) {
            ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1 = obj instanceof ConversationSuggestionResponseSerializer.AnonymousClass1 ? (ConversationSuggestionResponseSerializer.AnonymousClass1) obj : null;
            this.d = anonymousClass1;
            evks evksVar = obj instanceof evks ? (evks) obj : null;
            this.c = evksVar;
            boolean z2 = true;
            if (anonymousClass1 == null && evksVar == null) {
                z2 = false;
            }
            evlk.a(z2);
            this.a = evpjVar;
            this.b = z;
        }

        @Override // defpackage.evlg
        public final evlf a(evkn evknVar, evpj evpjVar) {
            if (!this.a.equals(evpjVar)) {
                if (!this.b) {
                    return null;
                }
                evpj evpjVar2 = this.a;
                if (evpjVar2.b != evpjVar.a) {
                    return null;
                }
            }
            return new TreeTypeAdapter(this.d, this.c, evknVar, evpjVar, this, true);
        }
    }

    public TreeTypeAdapter(ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1, evks evksVar, evkn evknVar, evpj evpjVar, evlg evlgVar, boolean z) {
        this.h = anonymousClass1;
        this.b = evksVar;
        this.a = evknVar;
        this.c = evpjVar;
        this.d = evlgVar;
        this.f = z;
    }

    private final evlf e() {
        evlf evlfVar = this.g;
        if (evlfVar != null) {
            return evlfVar;
        }
        evlf c = this.a.c(this.d, this.c);
        this.g = c;
        return c;
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        if (this.b == null) {
            return e().a(evplVar);
        }
        evkt a = evnc.a(evplVar);
        if (this.f && (a instanceof evkv)) {
            return null;
        }
        evks evksVar = this.b;
        evpj evpjVar = this.c;
        return evksVar.deserialize(a, evpjVar.b, this.e);
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        ConversationSuggestionResponseSerializer.AnonymousClass1 anonymousClass1 = this.h;
        if (anonymousClass1 == null) {
            e().b(evpnVar, obj);
            return;
        }
        if (this.f && obj == null) {
            evpnVar.j();
            return;
        }
        evpj evpjVar = this.c;
        evnc.b(anonymousClass1.serialize(obj, evpjVar.b, this.e), evpnVar);
    }

    @Override // defpackage.evnx
    public final evlf c() {
        return this.h != null ? this : e();
    }
}
