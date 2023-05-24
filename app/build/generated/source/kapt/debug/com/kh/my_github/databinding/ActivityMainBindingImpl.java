package com.kh.my_github.databinding;
import com.kh.my_github.R;
import com.kh.my_github.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivfollow, 5);
        sViewsWithIds.put(R.id.tvFollowersUnit, 6);
        sViewsWithIds.put(R.id.tvFollowingUnit, 7);
        sViewsWithIds.put(R.id.rvRepositories, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.ivProfile.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvFollowers.setTag(null);
        this.tvFollowing.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.kh.my_github.presentation.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.kh.my_github.presentation.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUser((androidx.lifecycle.LiveData<com.kh.my_github.data.model.User>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUser(androidx.lifecycle.LiveData<com.kh.my_github.data.model.User> ViewModelUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.kh.my_github.data.model.User viewModelUserGetValue = null;
        java.lang.String viewModelUserAvatarUrl = null;
        androidx.lifecycle.LiveData<com.kh.my_github.data.model.User> viewModelUser = null;
        int viewModelUserFollowers = 0;
        java.lang.String javaLangStringViewModelUserFollowingJavaLangString = null;
        java.lang.String viewModelUserLogin = null;
        java.lang.String javaLangStringViewModelUserFollowing = null;
        com.kh.my_github.presentation.viewmodel.MainViewModel viewModel = mViewModel;
        java.lang.String viewModelUserFollowersJavaLangString = null;
        int viewModelUserFollowing = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.user
                    viewModelUser = viewModel.getUser();
                }
                updateLiveDataRegistration(0, viewModelUser);


                if (viewModelUser != null) {
                    // read viewModel.user.getValue()
                    viewModelUserGetValue = viewModelUser.getValue();
                }


                if (viewModelUserGetValue != null) {
                    // read viewModel.user.getValue().avatarUrl
                    viewModelUserAvatarUrl = viewModelUserGetValue.getAvatarUrl();
                    // read viewModel.user.getValue().followers
                    viewModelUserFollowers = viewModelUserGetValue.getFollowers();
                    // read viewModel.user.getValue().login
                    viewModelUserLogin = viewModelUserGetValue.getLogin();
                    // read viewModel.user.getValue().following
                    viewModelUserFollowing = viewModelUserGetValue.getFollowing();
                }


                // read (viewModel.user.getValue().followers) + ("")
                viewModelUserFollowersJavaLangString = (viewModelUserFollowers) + ("");
                // read (" · ") + (viewModel.user.getValue().following)
                javaLangStringViewModelUserFollowing = (" · ") + (viewModelUserFollowing);


                // read ((" · ") + (viewModel.user.getValue().following)) + ("")
                javaLangStringViewModelUserFollowingJavaLangString = (javaLangStringViewModelUserFollowing) + ("");
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.kh.my_github.presentation.adapter.ImageBindingAdapterKt.loadCircleImage(this.ivProfile, viewModelUserAvatarUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelUserLogin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFollowers, viewModelUserFollowersJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFollowing, javaLangStringViewModelUserFollowingJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.user
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}