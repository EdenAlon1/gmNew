package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import defpackage.dceq;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcep implements ActionMode.Callback {
    final /* synthetic */ dceq a;

    public dcep(dceq dceqVar) {
        this.a = dceqVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_attach) {
            ellj.f(new dceq.a(), this.a.b);
            return true;
        }
        if (itemId == 16908332) {
            return this.a.b();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, final Menu menu) {
        this.a.a.getMenuInflater().inflate(R.menu.full_screen_gallery_menu, menu);
        if (menu.size() == 0) {
            return true;
        }
        final MenuItem item = menu.getItem(0);
        item.setActionView(R.layout.fullscreen_gallery_action_text_button);
        View actionView = item.getActionView();
        if (actionView == null) {
            return true;
        }
        ((TextView) actionView.findViewById(R.id.container_action_button)).setText(item.getTitle());
        actionView.setOnClickListener(new View.OnClickListener() { // from class: dceo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                menu.performIdentifierAction(item.getItemId(), 0);
            }
        });
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        AttachmentQueueState attachmentQueueState = ((dbxx) this.a.a).n;
        if (attachmentQueueState.a.isEmpty()) {
            return;
        }
        attachmentQueueState.a = (List) Collection.EL.stream(attachmentQueueState.a).filter(new Predicate() { // from class: dbzp
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !(((MediaContentItem) obj) instanceof GalleryContentItem);
            }
        }).collect(Collectors.toCollection(new dbzq()));
        attachmentQueueState.k();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }
}
