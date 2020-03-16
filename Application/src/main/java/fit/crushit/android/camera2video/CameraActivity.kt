/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fit.crushit.android.camera2video

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

//        // Check that the activity is using the layout version with
//        // the fragment_container FrameLayout
//        if (findViewById(R.id.fragment_container) != null) {
//
//            // However, if we're being restored from a previous state,
//            // then we don't need to do anything and should return or else
//            // we could end up with overlapping fragments.
//            if (savedInstanceState != null) {
//                return;
//            }
//
//            // Create a new Fragment to be placed in the activity layout
//            val firstFragment = HeadlinesFragment()
//
//            // In case this activity was started with special instructions from an
//            // Intent, pass the Intent's extras to the fragment as arguments
//            firstFragment.arguments = intent.extras
//
//            // Add the fragment to the 'fragment_container' FrameLayout
//            supportFragmentManager.beginTransaction()
//                    .add(R.id.fragment_container, firstFragment).commit()
//        }

//        savedInstanceState ?: getSupportFragmentManager().beginTransaction()
//                .replace(R.id.container, Camera2VideoFragment.newInstance())
//                .commit()

        savedInstanceState ?: supportFragmentManager.beginTransaction()
                    .replace(R.id.container, Camera2VideoFragment.newInstance())
                    .commit()
    }

}
