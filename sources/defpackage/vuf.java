package defpackage;

import android.widget.EditText;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.common.BugleSearchView;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vuf implements xl {
    final /* synthetic */ BugleSearchView a;
    final /* synthetic */ vvn b;

    public vuf(vvn vvnVar, BugleSearchView bugleSearchView) {
        this.a = bugleSearchView;
        this.b = vvnVar;
    }

    @Override // defpackage.xl
    public final boolean a(String str) {
        return false;
    }

    @Override // defpackage.xl
    public final void b(String str) {
        cuxh cuxhVar = this.b.ar;
        EditText searchTextView = this.a.getSearchTextView();
        if (cuxhVar.d() && searchTextView != null) {
            if (cuxt.j(str, null)) {
                searchTextView.setLayoutDirection(0);
                searchTextView.setTextDirection(3);
                searchTextView.setTextAlignment(3);
            } else {
                searchTextView.setLayoutDirection(2);
                searchTextView.setTextDirection(0);
                searchTextView.setTextAlignment(0);
            }
        }
        vvn vvnVar = this.b;
        vvnVar.cp = str;
        fr frVar = vvnVar.N.B;
        if (((Boolean) czpy.a.e()).booleanValue() && (frVar == null || frVar.ai())) {
            return;
        }
        vvn vvnVar2 = this.b;
        vvnVar2.aX.ifPresent(new Consumer() { // from class: vue
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final czpx czpxVar = (czpx) obj;
                vuf vufVar = vuf.this;
                vvn vvnVar3 = vufVar.b;
                String str2 = vvnVar3.cp;
                str2.getClass();
                str2.getClass();
                cbpg cbpgVar = (cbpg) czpxVar.a.b();
                SearchQuery.FreeTextSearchFilter freeTextSearchFilter = new SearchQuery.FreeTextSearchFilter(str2);
                final ConversationIdType conversationIdType = vvnVar3.M;
                ejlp ejlpVar = new ejlp(elfl.g(cbpgVar.a(SearchQuery.d(engw.s(freeTextSearchFilter, new SearchQuery.ConversationSearchFilter(conversationIdType))))).h(new emwl() { // from class: czpu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return (List) Collection.EL.stream(((cbpl) czpx.this.b.b()).k(conversationIdType, ((cbne) obj2).c())).map(new Function() { // from class: czpv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((MessageIdType) obj3).b();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new Supplier() { // from class: czpw
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new ArrayList();
                            }
                        }));
                    }
                }, czpxVar.c));
                vvn vvnVar4 = vufVar.b;
                vvnVar3.aL.i(ejlpVar, new ejlm(vvnVar4.cp), vvnVar4.j);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
